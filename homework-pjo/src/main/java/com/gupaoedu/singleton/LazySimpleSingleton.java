package com.gupaoedu.singleton;

/**
 * 懒汉模式
 * 优点：懒汉模式只在类使用的时候初始化类，不会造成内存浪费
 * 缺点：初始类时需要时间用户体验感差,这种懒汉模式容易出现并发问题
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton lazySimpleSingleton = null;

    private LazySimpleSingleton(){
        System.out.println("懒汉模式单例！");
    }

    public static LazySimpleSingleton newInstance(){
        if(lazySimpleSingleton == null){
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
