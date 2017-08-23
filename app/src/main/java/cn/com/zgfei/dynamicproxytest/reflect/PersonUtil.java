package cn.com.zgfei.dynamicproxytest.reflect;


import android.util.Log;

public class PersonUtil {

    public static void print(Person person) {
        Log.e("===", "===name:" + person.getName() + "==age:" + person.getAge() + "==sex:" + person.getSex() + "==address:" + person.getAddress());
    }
}
