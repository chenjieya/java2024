package com.alvis.array.exer1;

/**
 * ClassName: ArrayExer
 * Package: com.alvis.array.exer
 * Description: 数组练习
 *
 * @Author: chenjie
 * @Create: 2024/9/22 12:24
 */
public class ArrayExer {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 2, 1, 0, 3};
        int[] index = new int[]{2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3};

        String tel = "";
        for (int i = 0; i < index.length; i++) {
            int value = index[i];
            tel += arr[value];
        }

        System.out.println("联系方式： " + tel);  // 180 1382 0100
    }
}
