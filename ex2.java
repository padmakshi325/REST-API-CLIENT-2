import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.net.URI;

import org.json.JSONObject;
public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter city name to get weather details: ");
        String city = scanner.nextLine().replaceAll(" ", "%20");
        scanner.close();
        try {
            String urlString = "https://wttr.in/" + city + "?format=j1";
           URI uri = URI.create(urlString);
URL url = uri.toURL();

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();
                JSONObject json = new JSONObject(response.toString());
                JSONObject current = json.getJSONArray("current_condition").getJSONObject(0);
                String weatherReport = "----- Weather Report for " + city.replaceAll("%20", " ") + " -----\n" +
                                       "Temperature: " + current.getString("temp_C") + "°C\n" +
                                       "Feels Like: " + current.getString("FeelsLikeC") + "°C\n" +
                                       "Weather: " + current.getJSONArray("weatherDesc").getJSONObject(0).getString("value") + "\n" +
                                       "Humidity: " + current.getString("humidity") + "%\n" +
                                       "Wind Speed: " + current.getString("windspeedKmph") + " km/h\n" +
                                       "-------------------------------------------\n";
                FileWriter fileWriter = new FileWriter("weather.txt");
                fileWriter.write(weatherReport);
                fileWriter.close();
                System.out.println("Weather details saved to 'weather.txt'");
            } else {
                System.out.println("City not found or API request failed (Code: " + responseCode + ")");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}