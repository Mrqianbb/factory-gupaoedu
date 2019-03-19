package com.gupaoedu.singleton;

/**
 * 通过ThreadLocal实现单例
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> instance = new ThreadLocal<ThreadLocalSingleton>(){
        protected ThreadLocalSingleton initialValue(){
            return new ThreadLocalSingleton();
        }
    };
    private ThreadLocalSingleton(){}
    public static ThreadLocalSingleton getInstance(){
        return instance.get();
    }
}
