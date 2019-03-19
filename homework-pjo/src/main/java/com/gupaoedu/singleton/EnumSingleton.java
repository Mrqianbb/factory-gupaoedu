package com.gupaoedu.singleton;

/**
 * 使用枚举实现注册时单例
 * 简单快捷线程安全
 */
public enum EnumSingleton {

    INSTANCE;

    public static EnumSingleton getInstance(){
        return  INSTANCE;
    }

}
