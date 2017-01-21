package com.coolweather.app.util;

/**
 * Created by jiangxb on 2017/1/19.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
