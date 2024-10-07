package com.alvis.object.singleton;

public class Main {

    public static void main(String[] args) {
        SingleTon s1 = SingleTon.getSingleTon();
        SingleTon s2 = SingleTon.getSingleTon();

        System.out.println(s1.equals(s2));  // true 单例模式只能创建一个对象

    }

}
