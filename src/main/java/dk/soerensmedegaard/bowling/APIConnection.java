package dk.soerensmedegaard.bowling;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;

/**
 *
 * @author Søren Smedegaard
 */
public class APIConnection {  
    private final String uri = "http://13.74.31.101/api/points";
    
    public String get() {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
        
        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString()) 
            .thenApply(HttpResponse::body)
            .join();
    } 
    
    public String post(String data) {
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(uri))
            .header("Content-Type", "application/json")
            .POST(BodyPublishers.ofString(data))
            .build();

        try {
            HttpResponse<?> response = client.send(request, BodyHandlers.discarding());
            return response.statusCode() + "";
        } catch (IOException | InterruptedException ex) {
            return ex + "";
        }
    }
}
