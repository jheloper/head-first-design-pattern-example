package hfd.observer.weather_o_rama;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private double temperature;
    private double humidity;
    private double pressure;
    private List<Observer> observers;


    public WeatherData() {
        this.observers = new ArrayList<>();
    }
    
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        final int index = observers.indexOf(observer);
        if (0 <= index) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
