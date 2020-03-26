package dk.soerensmedegaard.bowling;

import java.util.ArrayList;

/**
 *
 * @author Søren Smedegaard
 */
public class Game {
    private final ArrayList<Frame> frames;
    
    public Game(ArrayList frames) {
        this.frames = frames;
    }

    public ArrayList<Frame> getFrames() {
        return frames;
    }
}
