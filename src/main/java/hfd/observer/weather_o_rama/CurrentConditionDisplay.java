package hfd.observer.weather_o_rama;

import java.text.MessageFormat;
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private Observable weatherData;
    private double temperature;
    private double humidity;


    public CurrentConditionDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println(MessageFormat.format("현재 기상 : {0} 섭씨 온도, {1} 습도", temperature, humidity));
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            final WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();

            display();
        }
    }
}
