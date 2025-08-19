package com.tunahaninci.havadurumu;

import com.google.gson.annotations.SerializedName;

public class WeatherResponse {

    @SerializedName("location")
    private Location location;

    @SerializedName("current")
    private Current current;

    public Location getLocation() { return location; }
    public Current getCurrent() { return current; }

    public static class Location {
        @SerializedName("name")
        private String name;

        public String getName() { return name; }
    }

    public static class Current {
        @SerializedName("temp_c")
        private double tempC;

        public double getTempC() { return tempC; }
    }

}
