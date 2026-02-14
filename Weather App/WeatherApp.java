import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherApp {

    // Replace with your API key
    private static final String API_KEY = "YOUR_API_KEY_HERE";

    public static void main(String[] args) {

        String city = "Mumbai";   // Change city here

        try {
            String urlString = "https://api.openweathermap.org/data/2.5/weather?q="
                    + city + "&appid=" + API_KEY + "&units=metric";

            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));

            String line;
            StringBuilder response = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            // Simple manual JSON parsing (basic extraction)
            String json = response.toString();

            String temperature = json.split("\"temp\":")[1].split(",")[0];
            String weather = json.split("\"main\":\"")[1].split("\"")[0];
            String humidity = json.split("\"humidity\":")[1].split("}")[0];

            System.out.println("===== Weather Report =====");
            System.out.println("City: " + city);
            System.out.println("Temperature: " + temperature + "°C");
            System.out.println("Weather: " + weather);
            System.out.println("Humidity: " + humidity + "%");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
