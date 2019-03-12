package com.gupaoedu.factory;

public class LinuxCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("学习Linux课程");
    }
}
