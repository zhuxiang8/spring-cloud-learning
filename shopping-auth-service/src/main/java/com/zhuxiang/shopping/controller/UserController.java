package com.zhuxiang.shopping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhuxiang
 * @date: 2018/9/11 09:21
 * @description:
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping
    public String getUser() {
        return "测试";
    }
}
