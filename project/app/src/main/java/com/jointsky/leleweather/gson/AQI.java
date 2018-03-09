package com.jointsky.leleweather.gson;

/**
 * Created by chenfan on 2018/3/9.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String qlty;
        public String pm25;
        public String pm10;
        public String no2;
        public String so2;
        public String co;
        public String o3;

    }
}
