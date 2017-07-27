package designpatterns.observer;

/**
 * Created by chenBing on 2017/7/27.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentCodditionsDisplay currentCodditionsDisplay = new CurrentCodditionsDisplay(weatherData);

        weatherData.setMeasurements(100, 200, 300);
    }
}
