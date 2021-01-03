package com.bing.service.iml;

import com.bing.mapper.UserMapper;
import com.bing.po.User;
import com.bing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 描述
 * @Author: gby_dev（耿兵洋）
 * @CreateDate: 2020/12/30 22:07
 * @Version: 1.0
 */
@Service("userService")
public class UserServiceIml implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> selectList() {
        return userMapper.selectList();
    }
}
