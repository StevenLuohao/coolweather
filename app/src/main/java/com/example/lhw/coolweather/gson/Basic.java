package com.example.lhw.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by LHW on 2017/12/4.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }


}
