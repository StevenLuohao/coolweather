package com.example.lhw.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by LHW on 2017/12/4.
 */

public class HttpUtil  {

    public static  void sendHttpRequest(String address,okhttp3.Callback callback)
    {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

    }


}
