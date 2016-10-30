package com.budofa.store.controler;

import com.budofa.store.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserContorller {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        return userService.findAll().get(0).toString();
    }
}