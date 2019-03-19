package com.gupaoedu.singleton;

/**
 * 饿汉模式单例
 * 优点：执行效率高，用户体验好
 * 缺点：类加载时初始化，不管该类是否能用上都初始化，浪费内存资源
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){
        System.out.println("饿汉模式单例加载！");
    }

    public static HungrySingleton newInstance(){
        return hungrySingleton;
    }

}
