package com.alvis.object.innerClass;

public class Main {

    public static void main(String[] args) {
        Test t = new Test() {
            @Override
            public void test() {
                System.out.println("内部类");
            }
        };

        t.test();
    }

}
