package com.kenshin.observer.customeImplement;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65f, 30.4f);
        weatherData.setMeasurements(82, 70f, 29.2f);
        weatherData.setMeasurements(78, 90f, 23.2f);
    }
}
