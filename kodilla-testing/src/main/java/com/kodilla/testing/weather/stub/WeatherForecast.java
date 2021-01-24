package com.kodilla.testing.weather.stub;
import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast(){
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averageForTemperature() {
        double sum = 0;
        for (Map.Entry<String, Double> i :
                temperatures.getTemperatures().entrySet()) {
            sum = sum + i.getValue();
        }
        if (calculateForecast().size() == 0) {
            return 0;
        } else {
            return sum / calculateForecast().size();
        }
    }

    public double medianForTemperature(){
        ArrayList<Double> listToMediana = new ArrayList<>();
        for (Map.Entry<String, Double> i :
                temperatures.getTemperatures().entrySet()) {
            listToMediana.add(i.getValue());
        }

        Collections.sort(listToMediana);
        int n = listToMediana.size();
        if ( n == 0 ){
            return 0;
        }
        else if (n %2 == 0 ){
            return ( listToMediana.get(((n)/2)-1) + listToMediana.get((n)/2) ) / 2;
        } else {
            return  listToMediana.get(((n+1)/2)-1);
        }
    }
}
