package hfd.observer.weather_o_rama;

import java.text.MessageFormat;

public class HeatIndexDisplay implements DisplayElement, Observer {

    private Subject weatherData;
    private double temperature;
    private double humidity;
    private double pressure;

    public HeatIndexDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        // 실제 계산식은 아니지만 임의로 계산
        double heatIndex = this.temperature + humidity + pressure;
        System.out.println(MessageFormat.format("체감 온도 : {0}", heatIndex));
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
