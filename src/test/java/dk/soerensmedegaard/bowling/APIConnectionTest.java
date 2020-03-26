package dk.soerensmedegaard.bowling;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Søren Smedegaard
 */
public class APIConnectionTest {
    
    public APIConnectionTest() {
    }
    
    /**
     * Test of get method, of class APIConnection.
     */
    @Test
    public void testGetConnection() {
        System.out.println("Test Get Method Connection...");
        APIConnection api = new APIConnection();
        String expected = "{\"points\":";
        String result = api.get().substring(0,10);
        assertEquals(expected, result);
    }

    /**
     * Test of post method, of class APIConnection.
     */
    @Test
    public void testPostConnection() {
        System.out.println("Test Post Method Connection...");
        String data = "";
        APIConnection api = new APIConnection();
        String expected = 400 + "";
        String result = api.post(data);
        assertEquals(expected, result);
    } 
}
