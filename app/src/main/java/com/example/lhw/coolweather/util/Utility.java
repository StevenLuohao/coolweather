package com.example.lhw.coolweather.util;

import android.text.TextUtils;

import com.example.lhw.coolweather.db.City;
import com.example.lhw.coolweather.db.County;
import com.example.lhw.coolweather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by LHW on 2017/12/4.
 */

public class Utility {

    /**
     * 解析和处理服务器返回的省级数据
     * @return
     */
    public static boolean handleProvinceResponse(String response)
    {
        if(!TextUtils.isEmpty(response))
        {
            try {
                JSONArray allProvinces = new JSONArray(response);
                for (int i =0;i<allProvinces.length();i++)
                {
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();


                }
                return true;



            } catch (JSONException e) {
                e.printStackTrace();
            }


        }
        return false;
    }



    /**
     * 解析和处理服务器返回的市级数据
     * @return
     */
    public static boolean handleCityResponse(String response,int provinceID)
    {
        if(!TextUtils.isEmpty(response))
        {
            try {
                JSONArray allCitys = new JSONArray(response);
                for (int i =0;i<allCitys.length();i++)
                {
                    JSONObject cityObject = allCitys.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(provinceID);
                    city.save();


                }
                return true;



            } catch (JSONException e) {
                e.printStackTrace();
            }


        }
        return false;
    }

    /**
     * 解析和处理服务器返回的县级数据
     * @return
     */
    public static boolean handleCountyResponse(String response,int cityId)
    {
        if(!TextUtils.isEmpty(response))
        {
            try {
                JSONArray allCountys = new JSONArray(response);
                for (int i =0;i<allCountys.length();i++)
                {
                    JSONObject countyObject = allCountys.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(countyObject.getString("name"));
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();


                }
                return true;



            } catch (JSONException e) {
                e.printStackTrace();
            }


        }
        return false;
    }






}