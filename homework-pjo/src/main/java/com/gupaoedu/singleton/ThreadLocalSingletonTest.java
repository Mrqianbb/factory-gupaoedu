package com.gupaoedu.singleton;

/**
 * 测试ThreadLocal实现单例
 * 测试结果证明：TheadLocal实现的单例只能在线程内实现单例，不同线程无法实现单例
 */
public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        new Thread(new Runnable() {
            public void run() {
                System.out.println(ThreadLocalSingleton.getInstance());
            }
        }).start();
        new Thread(new Runnable() {
            public void run() {
                System.out.println(ThreadLocalSingleton.getInstance());
            }
        }).start();
    }
}
