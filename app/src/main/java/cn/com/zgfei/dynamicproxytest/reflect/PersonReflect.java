package cn.com.zgfei.dynamicproxytest.reflect;


import android.util.Log;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class PersonReflect {

    public static void getPersonClass(Person person) {
        //1
        try {
            Class<?> person1 = Class.forName("cn.com.zgfei.dynamicproxytest.reflect.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //2
        Class<? extends Person> aClass = person.getClass();

        //3
        Class<Person> personClass = Person.class;

        //4.创建Person对象
        try {
            Person person1 = aClass.newInstance();

//            personClass.newInstance();

            person1.setName("xiaofei");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    //获取所有的变量
    public static void printField(String className) {
        Class<?> aClass = null;
        try {
            aClass = Class.forName(className);
            Field[] declaredFields = aClass.getDeclaredFields();
            for (Field f : declaredFields) {
                Log.e("===", "===" + Modifier.toString(f.getModifiers()) + " " + f.getType().getSimpleName() + " " + f.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取到全部的属性
     *
     * @param clazz 传入的对象
     */
    public static void getFields(Class<? extends Person> clazz) {
        Field[] declaredFields = clazz.getDeclaredFields();

        StringBuilder sb = new StringBuilder();
        int modifiers = clazz.getModifiers();
        String string = Modifier.toString(modifiers);
        String simpleName = clazz.getSimpleName();
        Log.e("====", "====" + string + "===" + simpleName);
        sb.append(string + " class " + simpleName + "{\n");

        for (Field f: declaredFields) {
            sb.append("\t");
            sb.append(Modifier.toString(f.getModifiers()) + "  ");
            sb.append(f.getType().getSimpleName() + "  ");
            sb.append(f.getName() + ";\n");
        }

        sb.append("}");

        Log.e("====", "===" + sb.toString());
    }

    /**
     * 获取固定属性，并修改其中的值
     *
     * @param person1
     */
    public static void getField(Class<? extends Person> person1) {
        Log.e("====", "====");
        try {
            Class<?> person = Class.forName("cn.com.zgfei.dynamicproxytest.reflect.Person");
            Field name = person.getDeclaredField("name");

            Object instance = person.newInstance();

            name.setAccessible(true);
            name.set(instance, "xiaofei");
            Log.e("====", "====" + name.get(instance));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 获取构造函数的参数类型
     *
     * @param clazz
     */
    public static void getConstructors(Class<? extends Person> clazz) {
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (int i = 0; i < constructors.length; i++) {
            Class<?>[] types = constructors[i].getParameterTypes();
            for (int j = 0; j < types.length; j++) {
                Log.e("====", "====" + types[j].getSimpleName());
            }
        }
    }

    public static void get(Class<? extends Person> clazz) {
        clazz.getSimpleName();
        clazz.getName();
        clazz.getCanonicalName();
        clazz.getClassLoader();
        clazz.getDeclaredFields();
        clazz.getDeclaredMethods();

        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        constructors[0].getParameterTypes();
    }

    public static void getOther(Class clazz) {
        Field[] declaredFields = clazz.getDeclaredFields();

        StringBuilder sb = new StringBuilder();
        int modifiers = clazz.getModifiers();
        String string = Modifier.toString(modifiers);
        String simpleName = clazz.getSimpleName();
        Log.e("====", "====" + string + "===" + simpleName);
        sb.append(string + " class " + simpleName + "{\n");

        for (Field f: declaredFields) {
            sb.append("\t");
            sb.append(Modifier.toString(f.getModifiers()) + "  ");
            sb.append(f.getType().getSimpleName() + "  ");
            sb.append(f.getName() + ";\n");

            f.getDeclaringClass();
        }

        sb.append("}");

        Log.e("====", "===" + sb.toString());

    }
}
