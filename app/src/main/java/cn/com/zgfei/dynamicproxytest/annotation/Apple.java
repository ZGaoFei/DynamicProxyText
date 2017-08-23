package cn.com.zgfei.dynamicproxytest.annotation;


import android.util.Log;

public class Apple {
    @FruitName("红富士")
    private String name;

    @FruitColor(FruitColorType.RED)
    private String color;

    @FruitProvider(id = 1, name = "china", address = "beijing")
    private String provider;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getProvider() {
        return provider;
    }

    public void print() {
        Log.e("====", "===name:" + getName() + "==color:" + getColor() + "==provider:" + getProvider());
    }
}
