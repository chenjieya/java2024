package com.alvis.object.modifier.packA;

public class TestA {


    public static void main(String[] args) {
        TestA a = new TestA();
        a.testDefault();
        a.testPublic();
        a.testPrivate();
        a.testProtected();
    }

    public void testPublic() {
        System.out.println("我是TestA类中的publci修饰符方法");
    }

    protected void testProtected() {
        System.out.println("我是TestA类中的protected修饰符方法");
    }

    void testDefault() {
        System.out.println("我是TestA类中的默认修饰符方法");
    }

    private void testPrivate() {
        System.out.println("我是TestA类中的private修饰符方法");
    }
}
