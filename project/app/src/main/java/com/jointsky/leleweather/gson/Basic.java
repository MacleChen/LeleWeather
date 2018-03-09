package com.jointsky.leleweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chenfan on 2018/3/9.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    @SerializedName("cnty")
    public String country;

    @SerializedName("lat")
    public String latitude;

    @SerializedName("lon")
    public String longitude;

    public Update update;


    public class Update {
        @SerializedName("loc")
        public String updateTime;

        @SerializedName("utc")
        public String updateUtcTime;
    }
}
