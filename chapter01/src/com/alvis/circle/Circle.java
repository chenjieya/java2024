package com.alvis.circle;

/**
 * ClassName: Circle
 * Package: com.alvis.circle
 * Description:
 * @Author: chenjie
 * @Create: 2024/9/17 17:26
 */
public class Circle {
    public static void main(String[] args) {
        // 计算并输出圆的面积
        double pi = 3.14;

        double r1 = 1.2;
        double r2 = 1.5;
        int r3 = 6;

        double s1 = pi * r1 * r1;
        double s2 = pi * r2 * r2;
        double s3 = pi * r3 * r3;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
