package com.gupaoedu.factory.abstractF;

public class LinuxCourseFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new LinuxCourse();
    }
}
