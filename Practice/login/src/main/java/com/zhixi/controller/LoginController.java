package com.zhixi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class LoginController {

    @PostMapping("login")
    public String login(@RequestParam("user_name") String userName, @RequestParam("user_pwd") String userPasswd) {
        if ("zhangsan".equals(userName) && "123".equals(userPasswd)) {
            return "登录成功";
        } else {
            return "登录失败";
        }
    }
}
