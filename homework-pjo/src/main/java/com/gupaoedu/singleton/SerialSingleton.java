package com.gupaoedu.singleton;

import java.io.Serializable;
//饿汉模式实现序列化
public class SerialSingleton implements Serializable {

    private static final SerialSingleton serialSingleton = new SerialSingleton();

    private SerialSingleton(){

    }
    public static SerialSingleton newInstance(){
        return serialSingleton;
    }

    //防止序列化破坏单例
    private Object readResolve(){
        return serialSingleton;
    }

}
