package com.gupaoedu.singleton;

import java.io.*;

public class EnumSingletonTest {
    public static void main(String[] args) {
        //采用序列化破坏枚举实现的注册式单例
        EnumSingleton enumSingleton = null;
        EnumSingleton enumSingleton1 = EnumSingleton.getInstance();

        FileOutputStream outputStream;

        {
            try {
                outputStream = new FileOutputStream("EnumSingleton.obj");
                ObjectOutputStream out = new ObjectOutputStream(outputStream);
                out.writeObject(enumSingleton1);
                out.flush();
                out.close();

                FileInputStream inputStream = new FileInputStream("EnumSingleton.obj");
                ObjectInputStream in = new ObjectInputStream(inputStream);
                enumSingleton = (EnumSingleton)in.readObject();
                in.close();
                System.out.println(enumSingleton1 == enumSingleton);

            } catch (java.io.IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

}
