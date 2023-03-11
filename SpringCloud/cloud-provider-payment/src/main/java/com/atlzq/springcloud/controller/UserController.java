package com.atlzq.springcloud.controller;

import com.atlzq.springcloud.entity.User;
import com.atlzq.springcloud.service.IUserService;
import com.atlzq.springcloud.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description TODO
 * @Date 2023/2/21 23:22
 * @Created by lzq
 */
@RestController
@RequestMapping("user")
@Api("用户查询")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private IUserService iUserService;

    @GetMapping("findAll")
    @ApiOperation("查询所有用户")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("findPage")
    @ApiOperation("分页查询用户")
    public List<User> findPage(@RequestParam("page") Integer page,@RequestParam("pageSize") Integer pageSize){
        return userService.findPage(page,pageSize);
    }

    @GetMapping("saveUserData")
    @ApiOperation("保存用户")
    public void inserUserData(){
        User user = new User();
        user.setAge(1);
        user.setName("lzqtest");
        user.setAge(18);
        user.setEmail("112@qq.com");
        iUserService.save(user);
    }


}
