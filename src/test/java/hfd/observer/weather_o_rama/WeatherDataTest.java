package hfd.observer.weather_o_rama;

import org.junit.Test;

public class WeatherDataTest {

    @Test
    public void testMeasurementsChanged() {
        final WeatherData weatherData = new WeatherData();

        final CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        final StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        final ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        final HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(1.5, 3.3, 5.7);
        weatherData.setMeasurements(3.6, 1.8, 10.8);
        weatherData.setMeasurements(11.3, 6.5, 8.8);
    }
}
