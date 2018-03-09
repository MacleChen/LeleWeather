package com.jointsky.leleweather.util;

import android.text.TextUtils;

import com.jointsky.leleweather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by chenfan on 2018/3/9.
 */

public class Utility {

    /**
     *  解析和处理服务器返回的市级数据
     * @param response
     * @return
     */
    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvinces = new JSONArray(response);
                for (int i = 0; i < allProvinces.length(); i++) {
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }

            }  catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return false;
    }
}
