package hfd.observer.weather_o_rama;

public class CurrentConditionDisplay implements Display {

    private double temperature;

    private double humidity;

    private double pressure;


    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        // and do something...
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
