package dk.soerensmedegaard.bowling;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Søren Smedegaard
 */
public class AlgorithmTest {
    
    public AlgorithmTest() {
    }
    
    /**
     * Test of calculateSums method, of class Algorithm.
     */
    @Test
    public void testCalculateSumWith0Frames() {
        System.out.println("Calculate Sum With 0 Frames...");    
        
        ArrayList<Frame> frames = new ArrayList();      
        Game game = new Game(frames);       
        Algorithm algorithm = new Algorithm(game);
        ArrayList<Integer> result = algorithm.calculateSums();
        
        ArrayList<Integer> expected = new ArrayList<>();

        assertEquals(expected, result);
    } 
    
    /**
     * Test of calculateSums method, of class Algorithm.
     */
    @Test
    public void testCalculateSumWith1Frame() {
        System.out.println("Calculate Sum With 1 Frame...");    
        
        ArrayList<Frame> frames = new ArrayList();      
        frames.add(new Frame(2,6));
        Game game = new Game(frames);       
        Algorithm algorithm = new Algorithm(game);
        ArrayList<Integer> result = algorithm.calculateSums();
        
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(8);           

        assertEquals(expected, result);
    } 

    /**
     * Test of calculateSums method, of class Algorithm.
     */
    @Test
    public void testCalculateSumsWith7Frames() {
        System.out.println("Calculate Sums With 7 Frames...");    
        
        ArrayList<Frame> frames = new ArrayList();      
        frames.add(new Frame(1,2));
        frames.add(new Frame(8,0));
        frames.add(new Frame(5,5));
        frames.add(new Frame(6,3));
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,0));
        frames.add(new Frame(2,2));
        Game game = new Game(frames);       
        Algorithm algorithm = new Algorithm(game);
        ArrayList<Integer> result = algorithm.calculateSums();
        
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(3);      
        expected.add(11);      
        expected.add(27);      
        expected.add(36);      
        expected.add(58);      
        expected.add(72);      
        expected.add(76);      

        assertEquals(expected, result);
    } 
    
    /**
     * Test of calculateSums method, of class Algorithm.
     */
    @Test
    public void testCalculateSumsWith10Strikes() {
        System.out.println("Calculate Sums With 10 Strikes...");    
        
        ArrayList<Frame> frames = new ArrayList();      
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,0));
        frames.add(new Frame(0,0));
        Game game = new Game(frames);       
        Algorithm algorithm = new Algorithm(game);
        ArrayList<Integer> result = algorithm.calculateSums();
        
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(30);      
        expected.add(60);      
        expected.add(90);      
        expected.add(120);      
        expected.add(150);      
        expected.add(180);      
        expected.add(210);      
        expected.add(240);      
        expected.add(260);      
        expected.add(270);      

        assertEquals(expected, result);
    } 
    
    /**
     * Test of calculateSums method, of class Algorithm.
     */
    @Test
    public void testCalculateSumsWith11Strikes() {
        System.out.println("Calculate Sums With 11 Strikes...");    
        
        ArrayList<Frame> frames = new ArrayList();      
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,0));
        Game game = new Game(frames);       
        Algorithm algorithm = new Algorithm(game);
        ArrayList<Integer> result = algorithm.calculateSums();
        
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(30);      
        expected.add(60);      
        expected.add(90);      
        expected.add(120);      
        expected.add(150);      
        expected.add(180);      
        expected.add(210);      
        expected.add(240);      
        expected.add(270);      
        expected.add(290);      

        assertEquals(expected, result);
    } 
    
    /**
     * Test of calculateSums method, of class Algorithm.
     */
    @Test
    public void testCalculateSumsWith12Strikes() {
        System.out.println("Calculate Sums With 12 Strikes...");    
        
        ArrayList<Frame> frames = new ArrayList();      
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,0));
        frames.add(new Frame(10,10));
        Game game = new Game(frames);       
        Algorithm algorithm = new Algorithm(game);
        ArrayList<Integer> result = algorithm.calculateSums();
        
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(30);      
        expected.add(60);      
        expected.add(90);      
        expected.add(120);      
        expected.add(150);      
        expected.add(180);      
        expected.add(210);      
        expected.add(240);      
        expected.add(270);      
        expected.add(300);      

        assertEquals(expected, result);
    } 
}
