package cn.com.zgfei.dynamicproxytest.proxy;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 */

public class NewInvocationHandler<T> implements InvocationHandler {
    private T obj;

    public NewInvocationHandler (T obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long millis = System.currentTimeMillis();
        Object invoke = method.invoke(obj, args);

        Log.e("=====", "==millis==" + millis);

        return invoke;
    }
}
