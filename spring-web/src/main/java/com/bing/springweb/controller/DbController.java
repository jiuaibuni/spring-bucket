package com.bing.springweb.controller;

import com.bing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 读写分离测试
 * @Author: gby_dev（耿兵洋）
 * @CreateDate: 2020/12/30 20:16
 * @Version: 1.0
 */
@RestController
@RequestMapping("db")
public class DbController {

    @Autowired
    private UserService userService;

    @RequestMapping("/read")
    public Object masterRead(){
        return userService.selectList();
    }
}
