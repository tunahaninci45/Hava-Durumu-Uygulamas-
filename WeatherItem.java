package com.tunahaninci.havadurumu;


public class WeatherItem {
    private String cityName;
    private double temperature;

    public WeatherItem(String cityName, double temperature) {
        this.cityName = cityName;
        this.temperature = temperature;
    }

    public String getCityName() { return cityName; }
    public double getTemperature() { return temperature; }
}