package com.bing.designpatterns;

/**
 * @Description: 策略模式
 * @Author: gby_dev（耿兵洋）
 * @CreateDate: 2020/12/17 21:20
 * @Version: 1.0
 */
public class Strategy {

    /**
     * 接口
     */
    interface Optional{
        /**
         * option方法
         * @param a
         * @param b
         * @return
         */
        int option(int a , int b);
    }

    /**
     * 加
     */
    static class Add implements Optional{

        @Override
        public int option(int a, int b) {
            return a + b;
        }
    }

    /**
     * 减
     */
    static class Reduce implements Optional{

        @Override
        public int option(int a, int b) {
            return a - b;
        }
    }

    /**
     * 乘
     */
    static class Multiply implements Optional{

        @Override
        public int option(int a, int b) {
            return a * b;
        }
    }

    /**
     * 除
     */
    static class Divide implements Optional{

        @Override
        public int option(int a, int b) {
            return a / b;
        }
    }

    private Optional optional;
    public Strategy(Optional optional){
        this.optional = optional;
    }

    public int doOption(int a, int b){
        int option = optional.option(a, b);
        return option;
    }

}
