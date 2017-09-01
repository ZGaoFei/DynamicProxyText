package cn.com.zgfei.dynamicproxytest;

import android.app.Application;

import cn.com.zgfei.dynamicproxytest.logger.LoggerUtils;


public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        LoggerUtils.setType(LoggerUtils.LOG_DEFAULT);//不打印
//        LoggerUtils.setType(LoggerUtils.LOG_E);//全部打印
    }
}
