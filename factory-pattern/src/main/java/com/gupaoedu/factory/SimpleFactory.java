package com.gupaoedu.factory;

public class SimpleFactory {


     //普通模式下的简单工厂
    /*public ICourse create(String name){
        if("Java".equals(name)){
            return new JavaCourse();
        }
        if("Linux".equals(name)){
            return new LinuxCourse();
        }
        return null;
    }*/

    //优化简单工厂
   /* public ICourse create(String className){

        if(null != className && !"".equals(className)){
            try {
               return (ICourse) Class.forName(className).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }*/
   //优化简单工厂2
    public ICourse create(Class<? extends ICourse> clazz){

        if (null != clazz && !"".equals(clazz)){
            try {
                return  (ICourse) clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return null;
    }



}
