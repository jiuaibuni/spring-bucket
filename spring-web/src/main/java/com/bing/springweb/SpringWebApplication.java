package com.bing.springweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description: 启动类
 * @Author: gby_dev（耿兵洋）
 * @CreateDate: 2020/12/17 20:57
 * @Version: 1.0
 */
@SpringBootApplication
@MapperScan("com.bing.mapper")
@ComponentScan("com.bing")
public class SpringWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebApplication.class, args);
	}

}
