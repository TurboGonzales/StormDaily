package com.example.StormDaily;

import com.google.gson.annotations.SerializedName;

public class ForecastWind {
    private float speed;

    @SerializedName("deg")
    private float degree;


    public float getSpeed() {
        return speed;
    }

    public float getDegree() {
        return degree;
    }
}
