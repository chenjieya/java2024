package com.alvis.object;

import com.alvis.object.Person.Person;

/**
 * ClassName: Main
 * Package: com.alvis.object
 * Description: object
 *
 * @Author: chenjie
 * @Create: 2024/10/1 15:49
 */
public class Main {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        boolean flage = p1.equals(p2);  // false

        System.out.println(flage);
    }

}
