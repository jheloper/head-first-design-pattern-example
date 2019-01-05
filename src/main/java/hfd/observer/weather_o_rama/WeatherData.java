package hfd.observer.weather_o_rama;

public class WeatherData {

    public CurrentConditionDisplay currentConditionDisplay;

    public StatisticsDisplay statisticsDisplay;

    public ForecastDisplay forecastDisplay;


    public WeatherData() {
        this.currentConditionDisplay = new CurrentConditionDisplay();
        this.statisticsDisplay = new StatisticsDisplay();
        this.forecastDisplay = new ForecastDisplay();
    }


    public double getTemperature() {
        return 1;
    }


    public double getHumidity() {
        return 3;
    }


    public double getPressure() {
        return 5;
    }


    public void measurementsChanged() {

        final double temperature = getTemperature();
        final double humidity = getHumidity();
        final double pressure = getPressure();

        currentConditionDisplay.update(temperature, humidity, pressure);
        statisticsDisplay.update(temperature, humidity, pressure);
        forecastDisplay.update(temperature, humidity, pressure);
    }
}
