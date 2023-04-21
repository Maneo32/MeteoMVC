package Model;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;


public class WeatherstackAPI {
    public static void main(String[] args) throws IOException {
        String apiKey = "996f3c41a8fb5c5c3ff14269919cf444";
        String city = "Maubeuge";
        String urlString = "http://api.weatherstack.com/current?access_key=" + apiKey + "&query=" + city;

        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);

        }
        in.close();
        String rep = response.toString();
        System.out.println(rep);
        JSONObject jsonObj = new JSONObject(rep);
        JSONObject current = jsonObj.getJSONObject("current");
        int temp = current.getInt("temperature");
        int speed = current.getInt("wind_speed");
        int humi = current.getInt("humidity");
        System.out.println(temp);


        Meteo meteo = new Meteo();
        meteo.modif(temp, speed, humi);
    }
    // belle bite
}