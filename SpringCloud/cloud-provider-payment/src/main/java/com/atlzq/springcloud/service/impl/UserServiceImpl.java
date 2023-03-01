package com.atlzq.springcloud.service.impl;

import com.atlzq.springcloud.entity.User;
import com.atlzq.springcloud.mapper.UserMapper;
import com.atlzq.springcloud.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Date 2023/3/1 22:20
 * @Created by lzq
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}
