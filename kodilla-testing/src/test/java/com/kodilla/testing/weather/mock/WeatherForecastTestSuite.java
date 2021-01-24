package com.kodilla.testing.weather.mock;
import com.kodilla.testing.weather.stub.Temperatures;                         // [2]
import com.kodilla.testing.weather.stub.TemperaturesStub;
import com.kodilla.testing.weather.stub.WeatherForecast;                      // [3]
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {
    private static Map<String, Double> temperaturesMap;
    private  static int i ;

    @BeforeEach
    private void beforeEachCreateDummyData(){
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszów", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        this.temperaturesMap = temperaturesMap;
    }
    @AfterEach
    private void afterEach(){
        System.out.println("Test has been executed. # " + i);
        i++;
    }
    @BeforeAll
    private static void beforeAll(){
        System.out.println("Tests are begine.");
        i=1;
    }
    @AfterAll
    private static void afterAll(){
        System.out.println("Tests are complete.");
    }

    @Mock
    private Temperatures temperaturesMock;

    @DisplayName("Test for: quantity Of Sensors")
    @Test
    void testCalulateForecastWithMock(){
        //Given
        // data from
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);          //
    }

    @DisplayName("Test for: calculate average for temperature.")
    @Test
    void  testAverageForTemperature(){
        //Given

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double averageForForecastData = weatherForecast.averageForTemperature();
        //Then
        Assertions.assertEquals(25.56,averageForForecastData);
    }

    @DisplayName("Test for: calculate median temperature")
    @Test
    void testMedianForTemperature(){
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double medianForForecastData = weatherForecast.medianForTemperature();
        //Then
        Assertions.assertEquals(25.5,medianForForecastData);
    }
}
