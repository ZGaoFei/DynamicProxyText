package cn.com.zgfei.dynamicproxytest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.lang.reflect.Proxy;

import cn.com.zgfei.dynamicproxytest.proxy.NewInvocationHandler;
import cn.com.zgfei.dynamicproxytest.proxy.Operate;
import cn.com.zgfei.dynamicproxytest.proxy.OperateImpl;
import cn.com.zgfei.dynamicproxytest.proxy.TimeInvocationHandler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operate2();
    }

    private void operate1() {
        OperateImpl operateImpl = new OperateImpl();
        TimeInvocationHandler invocationHandler = new TimeInvocationHandler(operateImpl);

        Operate operate = (Operate)(Proxy.newProxyInstance(
                Operate.class.getClassLoader(),
                new Class[] {Operate.class},
                invocationHandler));

        operate.operateMethod1();
        operate.operateMethod2();
        operate.operateMethod3();
    }

    private void operate2() {
        NewInvocationHandler invocationHandler = new NewInvocationHandler(new OperateImpl());

        Operate operate = (Operate) Proxy.newProxyInstance(
                Operate.class.getClassLoader(),
                new Class[]{Operate.class},
                invocationHandler);
        operate.operateMethod1();
        operate.operateMethod2();
        operate.operateMethod3();
    }
}
