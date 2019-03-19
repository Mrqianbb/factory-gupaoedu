package com.gupaoedu.singleton;

/**
 * 饿汉模式2
 * 通过静态块初始化类
 */
public class HungrySingleton1 {

    private static HungrySingleton1 hungrySingleton1 = null;

    private HungrySingleton1(){
        System.out.println("饿汉模式1：通过static块初始化！");
    }

    static{
        hungrySingleton1 = new HungrySingleton1();
    }

    public static HungrySingleton1 newInstance(){
        return hungrySingleton1;
    }
}
