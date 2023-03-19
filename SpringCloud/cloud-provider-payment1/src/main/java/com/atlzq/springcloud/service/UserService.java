package com.atlzq.springcloud.service;

import com.atlzq.springcloud.entity.User;
import com.atlzq.springcloud.mapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Date 2023/2/21 23:16
 * @Created by lzq
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> findAll(){
        //查询所有数据
        return userMapper.selectList(new LambdaQueryWrapper<>());
    }

    public List<User> findPage(int current,int pageSize){
        Page<User> page = new Page<>(current,pageSize);
        Page<User> userPage = userMapper.selectPage(page, new LambdaQueryWrapper<>());
        return userPage.getRecords();
    }
}
