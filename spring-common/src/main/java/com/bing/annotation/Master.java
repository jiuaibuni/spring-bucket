package com.bing.annotation;

import java.lang.annotation.*;

/**
 * @Description: Master注解
 * @Author: gby_dev（耿兵洋）
 * @CreateDate: 2020/12/20 20:16
 * @Version: 1.0
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Master {
}
