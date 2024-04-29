import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class WeatherApp {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
            try {
                var Scanner = new Scanner(System.in);

                System.out.println("Enter a zipcode");

                var input = Scanner.nextLine();

                if (!valid.zipCode(input)){
                    System.out.println("invalid zip");

                    logger.log("user input invalid zip");

                    return;
                }


                var Client =  HttpClient.newHttpClient();

                logger.log("calling api with zip"+ input);

                var request = HttpRequest.newBuilder()
                        .uri(new URI("http://api.openweathermap.org/data/2.5/forecast?zip="+input+",US&appid="+secret.apiKey))
                        .GET()
                        .build();
                var Response = Client.send(request, HttpResponse.BodyHandlers.ofString());

                var text = Response.body();

                var gson = new Gson();

                var WeatherResult = gson.fromJson(text, WeatherResult.Root.class);

                System.out.print(text);

                for(var i : WeatherResult.list){
                    System.out.println(i.weather.get(0).main);

                    System.out.println(i.main.temp*9/5 -459.67);

                }
            }
            catch (Exception e){
                logger.log("a unexcepted error occured");
                System.out.println("unexcepted error occured ");
            }

        }


    }


