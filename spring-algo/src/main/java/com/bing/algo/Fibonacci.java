package com.bing.algo;

/**
 * @Description: 斐波那契数列
 * @Author: gby_dev（耿兵洋）
 * @CreateDate: 2020/12/19 15:14
 * @Version: 1.0
 */
public class Fibonacci {

    /**
     * 方法1：迭代法
     * 要求输入一个整数n，输出斐波那契数列的第n项
     * 0,1,1,2,3,5,8,13,21,34....
     * f(n) = f(n-2) + f(n-1)
     * @param n
     * @return
     */
    private int fibonacci(int n){
        if (n <= 0){
            return 0;
        }
        if (n == 1 || n == 2){
            return 1;
        }
        int first = 1,second = 1;
        int third = 0;
        for (int i = 3; i <= n; i++) {
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }

    /**
     * 递归法（递归大量的重复计算会导致内存溢出）
     * @param n
     * @return
     */
    private int fibonacci2(int n){
        if (n <= 0){
            return 0;
        }
        if (n == 1 || n == 2){
            return 1;
        }
        return fibonacci2(n-2) + fibonacci2(n-1);
    }


}
