package com.gupaoedu.singleton;

import javax.management.RuntimeErrorException;

/**
 * 通过内部类来实现懒汉单例
 */
public class InnerClassSingleton {

    //默认使用InnerClassSingleton的时候，会先初始化内部类
    //如果没使用的话不会加载内部类
    private InnerClassSingleton(){
        if (InnerClass.innerClassSingleton != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    //static是为了单例的空间共享
    //final保证这个方法不会重写，重载
    public static InnerClassSingleton newInstance(){
        return InnerClass.innerClassSingleton;
    }

    //内部类在外部类不调用的情况下是不会加载内部类，但是一旦使用就会先加载内部类
    private static class InnerClass{
        private static final InnerClassSingleton innerClassSingleton = new InnerClassSingleton();
    }

}
