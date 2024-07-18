package com.gupaoedu.factory;

public class FactoryTest {

    /**
     * - 直接实例化: 快速但不灵活。
     * - 简单工厂: 通过工厂统一创建对象，增加灵活性。
     * - 简单工厂优化: 使用反射或Class对象提高工厂的通用性和安全性。
     * - 工厂方法模式: 通过接口和具体工厂类创建对象，更灵活、可扩展。
     * @param args
     */
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
