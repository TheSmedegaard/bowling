package dk.soerensmedegaard.bowling;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Søren Smedegaard
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initializing class
        APIConnection api = new APIConnection();

        // Get game points + token and convert string to JSONObject
        JSONObject jsonResponse = new JSONObject(api.get());
        System.out.println("RESPONSE: " + jsonResponse);

        // Convert nested JSONArray to nested ArrayList
        ArrayList<Frame> frames = new ArrayList();
        JSONArray jsonFrames = (JSONArray) jsonResponse.get("points");
        for (int i = 0; i < jsonFrames.length(); i++) {
            JSONArray jsonFrame = (JSONArray) jsonFrames.get(i);
            Frame frame = new Frame(jsonFrame.getInt(0), jsonFrame.getInt(1));
            frames.add(frame);
        }

        // Initializing class
        Game game = new Game(frames);

        // Initializing class and calculating sums
        Algorithm algorithm = new Algorithm(game);
        ArrayList<Integer> sums = algorithm.calculateSums();

        // Append points + token to object and convert to string
        JSONObject calculationsObject = new JSONObject();
        calculationsObject.put("points", sums);
        calculationsObject.put("token", jsonResponse.getString("token"));
        String calculations = calculationsObject.toString();
        System.out.println("REQUEST: " + calculations);

        //Send back calculated sums
        String response = api.post(calculations);
        System.out.println("HTTP status: " + response);
    }    
}
