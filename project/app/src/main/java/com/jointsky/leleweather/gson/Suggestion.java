package com.jointsky.leleweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chenfan on 2018/3/9.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;


    public class Comfort {
        @SerializedName("brf")
        public String brfTap;

        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("brf")
        public String brfTap;

        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("brf")
        public String brfTap;

        @SerializedName("txt")
        public String info;
    }
}
