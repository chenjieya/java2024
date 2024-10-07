package com.alvis.object.singleton;

public class SingleTon {

    private SingleTon() {};

    private static SingleTon single = new SingleTon();

    public static SingleTon getSingleTon() {
        return single;
    }
}
