package com.xiaojinzi.jar

class KotlinAspectTest: KotlinInterface, JavaInterface {

    fun test1() {
        println("KotlinAspectTest.test1()")
    }

    override fun kotlinMethodInter(): Int {
        return this.hashCode()
    }

    override fun javaMethodInter(): String {
        return "KotlinAspectTest.javaMethodInter()"
    }

}
