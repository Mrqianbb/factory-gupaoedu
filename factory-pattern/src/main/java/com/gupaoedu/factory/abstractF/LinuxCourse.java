package com.gupaoedu.factory.abstractF;

public class LinuxCourse implements ICourse {
    @Override
    public void lean() {
        System.out.println("lean Linux!");
    }

    @Override
    public void note() {
        System.out.println("note Linux!");
    }
}
