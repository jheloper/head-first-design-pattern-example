package hfd.observer.weather_o_rama;

public class WeatherData {

    private CurrentConditionDisplay currentConditionDisplay;

    private StatisticsDisplay statisticsDisplay;

    private ForecastDisplay forecastDisplay;


    public WeatherData() {
        this.currentConditionDisplay = new CurrentConditionDisplay();
        this.statisticsDisplay = new StatisticsDisplay();
        this.forecastDisplay = new ForecastDisplay();
    }


    public double getTemperature() {
        return Math.random();
    }


    public double getHumidity() {
        return Math.random();
    }


    public double getPressure() {
        return Math.random();
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
