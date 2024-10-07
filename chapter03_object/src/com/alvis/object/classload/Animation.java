package com.alvis.object.classload;

public class Animation {
    public String test = "Animation Feild";

    public static String testStatic = "Animation Static Feild";

    public Animation() {
        System.out.println("我是Aniamtion类中的无参数构造方法");
    }

    {
        System.out.println("我是Animation类中普通程序块");
    }

    static {
        System.out.println("我是Animation类中静态程序块");
    }


    public void test() {
        System.out.println("我是Animation类中的普通方法");
    }

    public static void testStatic() {
        System.out.println("我是Animation类中的静态方法");
    }
}
