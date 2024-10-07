package com.alvis.object.modifier.packA;

public class TestAA {
    public static void main(String[] args) {
        TestA a = new TestA();
        a.testDefault();
        a.testPublic();
//        a.testPrivate();   私有的
        a.testProtected();
    }
}
