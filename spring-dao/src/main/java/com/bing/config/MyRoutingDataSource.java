package com.bing.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @Description: 描述
 * @Author: gby_dev（耿兵洋）
 * @CreateDate: 2020/12/20 19:57
 * @Version: 1.0
 */
public class MyRoutingDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DbContextHolder.get();
    }
}
