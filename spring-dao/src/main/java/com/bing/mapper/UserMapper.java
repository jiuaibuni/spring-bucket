package com.bing.mapper;

import com.bing.po.User;

import java.util.List;

/**
 * @Description: 描述
 * @Author: gby_dev（耿兵洋）
 * @CreateDate: 2020/12/30 21:52
 * @Version: 1.0
 */
public interface UserMapper {

    List<User> selectList();
}
