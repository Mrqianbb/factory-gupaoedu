package com.gupaoedu.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 *通过缓存容器实现单例
 */
public class ContainerSingleton {

    private ContainerSingleton(){}
    //利用hashmap实现缓存容器
    private static final Map<String,Object> ioc = new HashMap<String, Object>();

    public static Object getBean(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        synchronized (ioc){
            if (!ioc.containsKey(className)){
                Object object = (ContainerSingleton)Class.forName(className).newInstance();
                ioc.put("ContainerSingleton",object);
                return object;

            }else{
                return ioc.get(className);
            }

        }
    }

}
