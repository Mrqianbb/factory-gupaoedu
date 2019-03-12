package com.gupaoedu.factory;
//抽象工厂
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse ceateCourse() {
        return new JavaCourse();
    }
}
