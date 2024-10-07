package com.alvis.object.Animation;

/**
 * ClassName: Animation
 * Package: com.alvis.object.Animation
 * Description:
 *
 * @Author: chenjie
 * @Create: 2024/10/1 15:50
 */
public class Animation {

    public String name;
    public int age;


    public void sleep() {
        System.out.println("动物的睡觉方法");
    }

    public void eat(String food) {
        System.out.println("动物的吃饭方法" + food);
    }

}
