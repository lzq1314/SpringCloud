package com.atlzq.springcloud.mapper;

import com.atlzq.springcloud.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description BaseMapper接口中提供了单表的所有操作，连表不行，需要自己实现
 * @Date 2023/2/21 22:54
 * @Created by lzq
 */
public interface UserMapper extends BaseMapper<User> {
}
