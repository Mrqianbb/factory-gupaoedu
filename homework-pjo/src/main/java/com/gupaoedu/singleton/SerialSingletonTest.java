package com.gupaoedu.singleton;

import java.io.*;

/**
 *序列化破坏单例
 */
public class SerialSingletonTest {

    public static void main(String[] args) {

        SerialSingleton serialSingleton =null;
        SerialSingleton serialSingleton1 = SerialSingleton.newInstance();

        try {
            //将java对象写成磁盘文件
            FileOutputStream outputStream = new FileOutputStream("SerialSingleton.pjo");
            ObjectOutputStream out = new ObjectOutputStream(outputStream);
            out.writeObject(serialSingleton1);
            out.flush();
            out.close();
            //将磁盘文件的通过流读入，生产java对象
            FileInputStream inputStream = new FileInputStream("SerialSingleton.pjo");
            ObjectInputStream in = new ObjectInputStream(inputStream);
            serialSingleton = (SerialSingleton) in.readObject();
            in.close();

            System.out.println(serialSingleton == serialSingleton1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
