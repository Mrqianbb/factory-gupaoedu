package com.gupaoedu.factory.abstractF;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        //抽象工厂方法模式
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        ICourse course = javaCourseFactory.createCourse();
        course.lean();
        course.note();

        LinuxCourseFactory linuxCourseFactory = new LinuxCourseFactory();
        ICourse course1 = linuxCourseFactory.createCourse();
        course1.note();
        course1.lean();

    }

}
