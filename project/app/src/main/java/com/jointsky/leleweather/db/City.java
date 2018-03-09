package com.jointsky.leleweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by chenfan on 2018/3/9.
 */

public class City extends DataSupport {

    /**
     * id
     */
    private int id;

    /**
     * cityName
     */
    private String cityName;

    /**
     * cityCode
     */
    private int cityCode;

    /**
     * provinceId
     */
    private int provinceId;


    /// get, set 方法实现

    public int getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
