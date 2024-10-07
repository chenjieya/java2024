package com.alvis.object.classload;

public class Person extends Animation {
    public String test = "Person Feild";

    public static String testStatic = "Person Static Feild";

    public Person() {
        System.out.println("我是Person类中的无参数构造方法");
    }

    {
        System.out.println("我是Person类中普通程序块");
    }

    static {
        System.out.println("我是Person类中静态程序块");
    }


    public void test() {
        System.out.println("我是Person类中的普通方法");
    }

    public static void testStatic() {
        System.out.println("我是Person类中的静态方法");
    }
}
