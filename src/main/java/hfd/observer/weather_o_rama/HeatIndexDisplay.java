package hfd.observer.weather_o_rama;

import java.text.MessageFormat;
import java.util.Observable;
import java.util.Observer;

public class HeatIndexDisplay implements Observer, DisplayElement {

    private Observable weatherData;
    private double temperature;
    private double humidity;

    public HeatIndexDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }

    @Override
    public void display() {
        // 실제 계산식은 아니지만 임의로 계산
        double heatIndex = this.temperature + humidity;
        System.out.println(MessageFormat.format("체감 온도 : {0}", heatIndex));
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
