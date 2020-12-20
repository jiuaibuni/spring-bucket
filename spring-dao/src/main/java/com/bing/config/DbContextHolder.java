package com.bing.config;

import com.bing.constant.DBTypeEnum;


/**
 * @Description: 通过ThreadLocal将数据源设置到每个线程上下文中
 * @Author: gby_dev（耿兵洋）
 * @CreateDate: 2020/12/20 17:57
 * @Version: 1.0
 */
public class DbContextHolder {

    private static final ThreadLocal<DBTypeEnum> contextHolder = new ThreadLocal<>();

    public static void set(DBTypeEnum dbType) {
        contextHolder.set(dbType);
    }

    public static DBTypeEnum get() {
        return contextHolder.get();
    }

    public static void master() {
        set(DBTypeEnum.M);
        System.out.println("切换到master");
    }

    public static void slave() {
        set(DBTypeEnum.S);
        System.out.println("切换到slave");
    }
}
