package com.jointsky.leleweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chenfan on 2018/3/9.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    public String hum;

    public String pres;

    public String vis;

    @SerializedName("cond")
    public More more;

    public class More {
        public String code;

        @SerializedName("txt")
        public String info;
    }

    /**
     * 风相关
     */
    public Wind wind;

    public class Wind {
        public String deg;

        public String dir;

        public String sc;

        public String spd;
    }
}
