package cn.com.zgfei.dynamicproxytest.logger;


import android.util.Log;

public class LoggerUtils {
    public static final int LOG_DEFAULT = -1;//不打印
    public static final int LOG_V = 0;//verbose
    public static final int LOG_D = 1;//debug
    public static final int LOG_I = 2;//info
    public static final int LOG_W = 3;//warn
    public static final int LOG_E = 4;//error

    private static int type = LOG_DEFAULT;

    public static void setType(int setType) {
        type = setType;
    }

    public static void e(String tag, String message) {
        if (type >= LOG_E) {
            Log.e(tag, message);
        }
    }

    public static void i(String tag, String message) {
        if (type >= LOG_I) {
            Log.i(tag, message);
        }
    }

    public static void d(String tag, String message) {
        if (type >= LOG_D) {
            Log.d(tag, message);
        }
    }

    public static void v(String tag, String message) {
        if (type >= LOG_V) {
            Log.v(tag, message);
        }
    }

    public static void w(String tag, String message) {
        if (type >= LOG_W) {
            Log.w(tag, message);
        }
    }
}
