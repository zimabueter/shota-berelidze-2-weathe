package controler;

public class WeatherBotController {
    public static String answer(String question) {
        String result;

        if ("all".equals(question)) {
            result = "winDir:EAST , windSpeed=20, cityName=TBILISI, pressure=80 , temperature = 20 , humidity = 15";
        }
        else if("rustavi".equals(question)){
            result = "winDir:NORTH , windSpeed=20, cityName=RUSTAVI, pressure=20 , temperature = 55 , humidity =75";
        }
          else {
            result = "ქალაქი არასწორია";
            }

        return result;
    }
}
