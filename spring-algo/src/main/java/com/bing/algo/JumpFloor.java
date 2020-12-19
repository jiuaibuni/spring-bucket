package com.bing.algo;

/**
 * @Description: 跳台阶问题
 * @Author: gby_dev（耿兵洋）
 * @CreateDate: 2020/12/19 15:47
 * @Version: 1.0
 */
public class JumpFloor {

    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法?
     * 解析： a.如果两种跳法，1阶或者2阶，那么假定第一次跳的是一阶，那么剩下的是n-1个台阶，跳法是f(n-1);
     * b.假定第一次跳的是2阶，那么剩下的是n-2个台阶，跳法是f(n-2)
     * c.由a，b假设可以得出总跳法为: f(n) = f(n-1) + f(n-2)
     * d.然后通过实际的情况可以得出：只有一阶的时候 f(1) = 1 ,只有两阶的时候可以有 f(2) = 2
     * 找规律分析法： f(1) = 1, f(2) = 2, f(3) = 3, f(4) = 5， 可以总结出f(n) = f(n-1) + f(n-2)的规律
     * 其实就是斐波那契数列的问题
     * @param n
     * @return
     */
    private int jumpFloor(int n){
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int first = 1, second = 2, third = 0;
        for (int i = 3; i <= n; i++) {
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }

    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法?
     * 解析：假设n>=2，第一步有n种跳法：跳1级、跳2级、到跳n级
     * 跳1级，剩下n-1级，则剩下跳法是f(n-1)
     * 跳2级，剩下n-2级，则剩下跳法是f(n-2) ......
     * 跳n-1级，剩下1级，则剩下跳法是f(1) 跳n级，剩下0级，则剩下跳法是f(0)
     * 所以在n>=2的情况下： f(n)=f(n-1)+f(n-2)+...+f(1) 因为f(n-1)=f(n-2)+f(n-3)+...+f(1)
     * 所以f(n)=2*f(n-1) 又f(1)=1,所以可得f(n)=2^(number-1)
     * @param n
     * @return
     */
    private int JumpFloor2(int n) {
        return 1 << --n;
    }

}
