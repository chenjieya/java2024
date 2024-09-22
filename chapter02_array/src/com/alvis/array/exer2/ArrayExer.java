package com.alvis.array.exer2;

import java.util.Scanner;

/**
 * ClassName: ArrayExer
 * Package: com.alvis.array.exer2
 * Description:
 *
 * @Author: chenjie
 * @Create: 2024/9/22 12:33
 */
public class ArrayExer {
    public static void main(String[] args) {
        // 用一个数组，保存星期一到星期天的7个英文单词，从键盘输入1-7显示对应的单词
        String[] weeks = new String[]{"Monday", "Tuesday", "Wedesday", "Thursday", "Friday", "Saturday", "Sunday"};


        Scanner scan = new Scanner(System.in);
        System.out.println("请输入1-7：");

        int day = scan.nextInt();

        if (day < 1 || day > 7) {
            System.out.println("请输入数字的正确范围");
        } else {
            System.out.println(weeks[day - 1]);
        }
    }
}
