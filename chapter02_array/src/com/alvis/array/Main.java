package com.alvis.array;

/**
 * ClassName: Main
 * Package: com.alvis.array
 * Description: 数组
 *
 * @Author: chenjie
 * @Create: 2024/9/18 19:45
 */
public class Main {

    public static void main(String[] args) {
        // 1. 数组初始化
        // 1.1 数组初始化
        double[] myList;
        myList = new double[]{12.0, 0.12, 12.3, 17.66};

        // 1.2 数组初始化
        String[] foods;
        foods = new String[]{"豆腐", "西红柿", "鸡蛋"};
        foods = new String[3];

        // 1.3 数组初始化
        int[] prices = {10, 20, 30};

        System.out.println("---------------------------------------------------------------");

        // 2. 数组元素的调用
        System.out.println(foods[0]);


        // 3. 遍历数组
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i]);
        }


        // 4. 数组元素的默认初始化值
        /**
         * 整型数组元素的默认初始化值  ---  0
         * 浮点型数组元素的默认初始化值  --- 0.0
         * 字符类型数组元素默认初始化值  --- 0
         * boolean类型数组元素默认初始化值  --- false
         * 引用类型数组元素初始化值   --- null
         */
        int[] arr = new int[3];
        System.out.println(arr[0]);

        // 5. 数组内存解析
    }

}
