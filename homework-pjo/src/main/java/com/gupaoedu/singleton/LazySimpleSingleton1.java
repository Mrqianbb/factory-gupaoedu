package com.gupaoedu.singleton;

/**
 * 懒汉模式
 * 优点：没有并发创建问题
 * 缺点：有synchronized关键字执行效率低
 */
public class LazySimpleSingleton1 {

    private static LazySimpleSingleton1 lazySimpleSingleton1 = null;

    private LazySimpleSingleton1(){
        System.out.println("消除并发问题的懒汉模式！");
    }

    //这种模式容易导致整个类被锁住
    public static synchronized LazySimpleSingleton1 newInstance(){

        if(lazySimpleSingleton1 == null){
            lazySimpleSingleton1 = new LazySimpleSingleton1();
        }

        return lazySimpleSingleton1;
    }

    public static LazySimpleSingleton1 newInstance1(){
        if(lazySimpleSingleton1 == null){
            synchronized (LazySimpleSingleton1.class){
               if(lazySimpleSingleton1 == null){
                   lazySimpleSingleton1 = new LazySimpleSingleton1();
               }
            }
        }

        return lazySimpleSingleton1;
    }
}
