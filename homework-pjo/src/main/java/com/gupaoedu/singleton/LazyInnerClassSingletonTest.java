package com.gupaoedu.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射破坏单例
 */
public class LazyInnerClassSingletonTest {

    public static void main(String[] args) {
        //获取class对象
        Class<?> clazz = InnerClassSingleton.class;
        try {
            //通过反射获取该类的构造器
            Constructor constructor = clazz.getDeclaredConstructor(null);
            //强制访问
            constructor.setAccessible(true);
            Object object = constructor.newInstance();
            Object object1 = constructor.newInstance();
            System.out.println(object == object1);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
