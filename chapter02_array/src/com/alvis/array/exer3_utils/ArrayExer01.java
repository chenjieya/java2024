package com.alvis.array.exer3_utils;

import java.util.Arrays;

/**
 * ClassName: ArrayExer01
 * Package: com.alvis.array.exer3_utils
 * Description: 工具
 *
 * @Author: chenjie
 * @Create: 2024/9/22 13:15
 */
public class ArrayExer01 {
    public static void main(String[] args) {

        // equals 比较两个数组是否相等
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{1,2,3,4,5};

        System.out.println(arr1 == arr2);  // false  比较的是地址
        System.out.println(Arrays.equals(arr1, arr2));  // true  比较的是两个的内容



        // toString
        System.out.println(Arrays.toString(arr1));  // [1, 2, 3, 4, 5]

        // fill 数组填充
        Arrays.fill(arr1, 10);
        System.out.println(Arrays.toString(arr1));  // [10, 10, 10, 10, 10]

        // sort 快速排序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2)); // [1, 2, 3, 4, 5]

        // binarySearch  二分查找  前提必须是有序的数组
        int index = Arrays.binarySearch(arr2, 3);
        System.out.println(index);  // 2

        int indexs = Arrays.binarySearch(arr2, 30);
        System.out.println(indexs);  // -6  返回的是复数就是没找到
    }
}
