package com.jointsky.leleweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by chenfan on 2018/3/9.
 */

public class Province extends DataSupport {

    /**
     * id
     */
    private int id;

    /**
     * provinceName
     */
    private String provinceName;

    /**
     * provinceCode
     */
    private int provinceCode;


    /// get ,set 方法实现
    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
