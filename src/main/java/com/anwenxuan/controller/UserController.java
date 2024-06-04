package com.anwenxuan.controller;


import com.anwenxuan.common.lang.Result;
import com.anwenxuan.entity.User;
import com.anwenxuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zzx
 * @since 2024-05-13
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public Object test(@PathVariable("id") Long id) {
        User user =  userService.getById(id);
        return Result.succ(user);
    }

    @GetMapping("/index")
    public Result index() {
        User user = userService.getById(1L);
        return Result.succ(user);
    }
}
/*
* 1、报错  Resolved [org.springframework.web.HttpMediaTypeNotAcceptableException: Could not find acceptable representation]
*    表明统一结果类中没有 setter 和 getter
* */
