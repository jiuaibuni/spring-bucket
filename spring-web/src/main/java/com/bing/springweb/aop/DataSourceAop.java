package com.bing.springweb.aop;

import com.bing.config.DbContextHolder;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Description: 数据源aop
 * @Author: gby_dev（耿兵洋）
 * @CreateDate: 2020/12/20 20:07
 * @Version: 1.0
 */
@Aspect
@Component
public class DataSourceAop {

    @Pointcut("!@annotation(com.bing.annotation.Master) "
              + "&& (execution(* com.bing.mapper..*.select*(..)) "
              + "|| execution(* com.bing.mapper..*.get*(..)))")
    public void readPointcut(){}

    @Pointcut("@annotation(com.bing.annotation.Master) "
            + "|| execution(* com.bing.mapper..*.insert*(..)) "
            + "|| execution(* com.bing.mapper..*.add*(..)) "
            + "|| execution(* com.bing.mapper..*.update*(..)) "
            + "|| execution(* com.bing.mapper..*.edit*(..)) "
            + "|| execution(* com.bing.mapper..*.delete*(..)) "
            + "|| execution(* com.bing.mapper..*.remove*(..))")
    public void writePointcut(){}

    @Before("readPointcut()")
    public void read(){
        DbContextHolder.slave();
    }

    @Before("writePointcut()")
    public void write(){
        DbContextHolder.master();
    }


}
