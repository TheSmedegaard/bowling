package dk.soerensmedegaard.bowling;

import java.util.ArrayList;

/**
 *
 * @author Søren Smedegaard
 */
public class Algorithm {
    private final Game game;
    private int currentFrame;
    private int currentSum;

    public Algorithm(Game game) {
        this.game = game;
    }
    
    // Looping through all frames in the game and adds calculated sums to the ArrayList
    public ArrayList<Integer> calculateSums() {
        ArrayList<Integer> sumArray = new ArrayList();     
        for (currentFrame = 0; currentFrame < game.getFrames().size(); currentFrame++) {
            if (currentFrame < 10) { // Checks that there are a maximum of 10 frames
            currentSum += frameScore(game.getFrames().get(currentFrame));
                sumArray.add(currentSum);
            }
        }
        return sumArray;
    }
    
    // Return the total score for a frame. Including bonus points
    private int frameScore(Frame frame) {
        int score;      
        if (frame.getRoll1() == 10) { // Check if it is a strike
            score = 10;
            score += strikeBonus();
        }
        else if (frame.getRoll1() != 10 && frame.getSum() == 10) { // Check if it is a spare
            score = 10;
            score += spareBonus();
        }
        else {
            score = frame.getSum();
        } 
        return score;
    }
    
    // Return strike bonus(es)
    private int strikeBonus() {
        int bonus = 0;
        Frame nextFrame = getFrameAtIndex(currentFrame + 1);
        if(nextFrame == null){
            return bonus;
        }
        bonus = nextFrame.getRoll1(); // Add first roll bonus
        if (bonus == 10) {
            if (currentFrame == 9) { // Is it the last frame?
                bonus += nextFrame.getRoll2();  // Add second roll bonus
                return bonus;
            }
            nextFrame = getFrameAtIndex(currentFrame + 2); 
            if (nextFrame == null) {
                return bonus;
            }
            bonus += nextFrame.getRoll1(); // Add second roll bonus
        }
        else {
            bonus += getFrameAtIndex(currentFrame + 1).getRoll2(); // Add second roll bonus
        }
        return bonus;       
    }

    // Return spare bonus
    private int spareBonus() {
        int bonus = 0;
        Frame nextFrame = getFrameAtIndex(currentFrame + 1);
        if(nextFrame != null){
            bonus = nextFrame.getRoll1(); // Add spare roll bonus
        }
        return bonus;
    }
    
    // Return Frame of index
    private Frame getFrameAtIndex(int index) {
        if (index + 1 <= game.getFrames().size()) {
            return game.getFrames().get(index);
        }
        else return null;
    }
}
