package com.xiaojinzi.jar;

public class JavaAspectTest implements JavaInterface, KotlinInterface {

    public void test1() {
        System.out.println("JavaAspectTest.test1()");
    }

    @Override
    public String javaMethodInter() {
        return "JavaAspectTest.javaMethodInter";
    }

    @Override
    public int kotlinMethodInter() {
        return this.hashCode();
    }

}
