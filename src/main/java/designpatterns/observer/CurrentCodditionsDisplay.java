package designpatterns.observer;

/**
 * Created by chenBing on 2017/7/27.
 */
public class CurrentCodditionsDisplay implements Observer, DisplayElement {
    private Subject weatherData;
    private float temp;
    private float humidity;
    private float pressure;

    public CurrentCodditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("current conditions :" + temp + " F degress and " + humidity + " % humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
