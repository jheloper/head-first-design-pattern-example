package hfd.observer.weather_o_rama;

import java.text.MessageFormat;

public class ForecastDisplay implements Observer, DisplayElement {

    private Subject weatherData;
    private double temperature;
    private double humidity;
    private double pressure;


    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(MessageFormat.format("기상 예보 : {0} 섭씨 온도, {1} 습도, {2} 기압", temperature, humidity, pressure));
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
