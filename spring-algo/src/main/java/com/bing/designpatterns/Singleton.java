package com.bing.designpatterns;

/**
 * @Description: 单例模式
 * @Author: gby_dev（耿兵洋）
 * @CreateDate: 2020/12/17 20:26
 * @Version: 1.0
 */
public class Singleton {

    /**
     * 饿汉式：线程安全
     */
    static class Singleton1{
        // 构造方法私有化
        private Singleton1(){}
        // 自身实例化对象
        private static Singleton1 singleton1 = new Singleton1();
        // 静态方法返回该实例
        public static Singleton1 getInstance(){
            return singleton1;
        }
    }

    /**
     * 懒汉式：双重检测保证线程安全
     */
    static class Singleton2{
        // 构造方法私有化
        private Singleton2(){}
        // 自身实例化对象，volatile保证其内存可见性
        private static volatile Singleton2 singleton2 = null;
        // 静态方法返回该实例
        public static Singleton2 getInstance(){
            // 第一次检查singleton是否被实例化
            if (singleton2 == null){
                synchronized (Singleton2.class){
                    // 获取锁的线程进行判断singleton是否被实例化
                    if (singleton2 == null){
                        singleton2 = new Singleton2();
                    }
                }
            }
            return singleton2;
        }
    }

}
