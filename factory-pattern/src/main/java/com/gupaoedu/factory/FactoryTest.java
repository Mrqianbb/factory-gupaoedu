package com.gupaoedu.factory;

public class FactoryTest {

    public static void main(String[] args) {
        //没使用任何工厂模式
        /*ICourse javaCourse = new JavaCourse();
        javaCourse.study();
        ICourse linuxCourse = new LinuxCourse();
        linuxCourse.study();*/

        //简单工厂
        /*SimpleFactory factory= new SimpleFactory();
        ICourse course = factory.create("Java");
        course.study();
        ICourse course1 = factory.create("Linux");
        course1.study();*/

        //简单工厂优化1
        /*SimpleFactory factory= new SimpleFactory();
        ICourse course = factory.create("com.gupaoedu.factory.JavaCourse");
        course.study();*/

        //简单工厂优化2
        /*SimpleFactory factory = new SimpleFactory();
        ICourse course = factory.create(JavaCourse.class);
        course.study();*/

        //工厂方法模式
        /*JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        ICourse course = javaCourseFactory.ceateCourse();
        course.study();
        LinuxCourseFactory linuxCourseFactory = new LinuxCourseFactory();
        ICourse course1 = linuxCourseFactory.ceateCourse();
        course1.study();*/


    }
}
