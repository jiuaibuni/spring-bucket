package com.bing.service;

import com.bing.po.User;

import java.util.List;

/**
 * @Description: 描述
 * @Author: gby_dev（耿兵洋）
 * @CreateDate: 2020/12/30 22:02
 * @Version: 1.0
 */
public interface UserService {

    /**
     * 查询user列表
     * @return
     */
    List<User> selectList();
}
