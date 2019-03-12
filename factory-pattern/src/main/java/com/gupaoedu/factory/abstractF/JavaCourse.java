package com.gupaoedu.factory.abstractF;

public class JavaCourse implements ICourse {
    @Override
    public void lean() {
        System.out.println("lean Java!");
    }

    @Override
    public void note() {
        System.out.println("note Java!");
    }
}
