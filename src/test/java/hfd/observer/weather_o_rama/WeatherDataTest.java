package hfd.observer.weather_o_rama;

import org.junit.Assert;
import org.junit.Test;

public class WeatherDataTest {

    @Test
    public void testMeasurementsChanged() {
        final WeatherData weatherData = new WeatherData();
        weatherData.measurementsChanged();

        Assert.assertEquals(3, weatherData.currentConditionDisplay.getHumidity(), 0);
        Assert.assertEquals(5, weatherData.currentConditionDisplay.getPressure(), 0);
        Assert.assertEquals(1, weatherData.currentConditionDisplay.getTemperature(), 0);

        Assert.assertEquals(3, weatherData.forecastDisplay.getHumidity(), 0);
        Assert.assertEquals(5, weatherData.forecastDisplay.getPressure(), 0);
        Assert.assertEquals(1, weatherData.forecastDisplay.getTemperature(), 0);

        Assert.assertEquals(3, weatherData.statisticsDisplay.getHumidity(), 0);
        Assert.assertEquals(5, weatherData.statisticsDisplay.getPressure(), 0);
        Assert.assertEquals(1, weatherData.statisticsDisplay.getTemperature(), 0);
    }
}
