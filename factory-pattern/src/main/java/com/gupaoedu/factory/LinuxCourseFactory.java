package com.gupaoedu.factory;
//Linux课程抽象工厂
public class LinuxCourseFactory implements ICourseFactory {
    @Override
    public ICourse ceateCourse() {
        return new LinuxCourse();
    }
}
