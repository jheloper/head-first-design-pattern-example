package hfd.observer.weather_o_rama;

import java.text.MessageFormat;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private Subject weatherData;
    private double temperature;
    private double humidity;


    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(MessageFormat.format("현재 기상 : {0} 섭씨 온도, {1} 습도", temperature, humidity));
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
