package cn.com.zgfei.dynamicproxytest.proxy;

import android.util.Log;

/**
 * 委托类
 */

public class OperateImpl implements Operate {

    @Override
    public void operateMethod1() {
        Log.e("=====", "==operateMethod1==");
        sleep(100);
    }

    @Override
    public void operateMethod2() {
        Log.e("=====", "==operateMethod2==");
        sleep(200);
    }

    @Override
    public void operateMethod3() {
        Log.e("=====", "==operateMethod3==");
        sleep(300);
    }

    private void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
