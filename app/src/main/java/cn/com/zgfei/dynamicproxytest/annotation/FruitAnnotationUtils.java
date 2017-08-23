package cn.com.zgfei.dynamicproxytest.annotation;


import android.util.Log;

import java.lang.reflect.Field;

/**
 * 注解处理器
 */
public class FruitAnnotationUtils {

    public static void getFruitInfo(Class<?> clazz) {
        String strFruitName = "fruit name:";
        String strFruitColor = "fruit color:";
        String strFruitProvider = "fruit provider:";

        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(FruitName.class)) {
                FruitName fruitName = field.getAnnotation(FruitName.class);
                strFruitName += fruitName.value();

                Log.e("==strFruitName==", "====" + strFruitName);
            } else if (field.isAnnotationPresent(FruitColor.class)) {
                FruitColor fruitColor = field.getAnnotation(FruitColor.class);
                strFruitColor += fruitColor.value();

                Log.e("==strFruitColor==", "====" + strFruitColor);
            } else if (field.isAnnotationPresent(FruitProvider.class)) {
                FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
                strFruitProvider += fruitProvider.id() + "," + fruitProvider.name() + "," + fruitProvider.address();

                Log.e("==strFruitProvider==", "====" + strFruitProvider);
            }
        }
    }
}
