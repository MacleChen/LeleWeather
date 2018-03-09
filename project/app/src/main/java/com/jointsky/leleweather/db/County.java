package com.jointsky.leleweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by chenfan on 2018/3/9.
 */

public class County extends DataSupport {

    /**
     * id
     */
    private int id;

    /**
     * countyName
     */
    private String countyName;

    /**
     * weatherId
     */
    private String weatherId;

    /**
     * cityId
     */
    private int cityId;


    /// get, set 方法的实现


    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
