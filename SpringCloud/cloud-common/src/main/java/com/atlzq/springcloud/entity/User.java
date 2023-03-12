package com.atlzq.springcloud.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Description TODO
 * @Date 2023/2/21 22:51
 * @Created by lzq
 */
@Data
//如果表明和实体类名不一致，
@TableName(value = "user")
public class User {
    //标记该属性为主键。value:标记列名和属性名的对应
    @TableId(value = "id")
    private Integer id;
    //如果属性名和列名不一样
    @TableField(value = "name")
    private String name;

    private Integer age;

    private String email;
}
