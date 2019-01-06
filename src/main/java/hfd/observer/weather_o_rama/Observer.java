package hfd.observer.weather_o_rama;

public interface Observer {
    void update(double temp, double humidity, double pressure);
}
