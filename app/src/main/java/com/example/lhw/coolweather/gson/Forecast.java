package com.example.lhw.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by LHW on 2017/12/4.
 */

public class Forecast {

    public String date;

    @SerializedName("cond")
    public More more;

    @SerializedName("tmp")
    public Temperature temperature;

    public class More{

        @SerializedName("txt")
        public String info;
    }

    public class Temperature{

        public String max;

        public  String  min;
    }



}
