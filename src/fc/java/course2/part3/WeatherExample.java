package fc.java.course2.part3;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherExample {
  public static void main(String[] args) {
    String apiKey="fcf14e417ac4157870d41ac149b26835";
    String city="Seoul";
    String urlString =
        "https://api.openweathermap.org/data/2.5/weather?q="
            + city
            + "&appid="
            + apiKey
            + "&units=metric";
//    float lat = 37.5665f;
//    float lon = 126.978f;
//    String urlString = "https://api.openweathermap.org/data/3.0/onecall?lat="+ lat + "&lon="+lon +"&appid="+apiKey+ "&units=metric";
    try{
      URL url = new URL(urlString);
      HttpURLConnection con = (HttpURLConnection) url.openConnection();
      con.setRequestMethod("GET");
      con.setRequestProperty("Accept", "application/json");

      int responseCode = con.getResponseCode();
      if (responseCode == 200) {
       BufferedReader in = new BufferedReader( new InputStreamReader(con.getInputStream()));
       String inputLine;
       StringBuffer response = new StringBuffer();
       while ((inputLine = in.readLine()) != null) {
         response.append(inputLine);
       }
        in.close();
       System.out.println(response.toString());
        JsonObject weatherData = JsonParser.parseString(response.toString()).getAsJsonObject();

        JsonObject mainData = weatherData.getAsJsonObject("main");

        double temp = mainData.get("temp").getAsDouble();

        System.out.println("temp = " + temp);
        con.disconnect();

        ;
      }else {

      }
    } catch (Exception e) {
      e.printStackTrace();//에러메시지 출력
    }
  }
}
