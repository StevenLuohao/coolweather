package com.example.lhw.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by LHW on 2017/12/4.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public  More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
