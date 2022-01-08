package com.murphy.test2.controller;

import com.murphy.test4.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Murphy
 */
@Controller
@Slf4j
public class UserController {
    @DubboReference
    UserService userService;
    @GetMapping("/user")
    public ModelAndView getUser(){
        log.info(userService.getUser());
        return new ModelAndView("base");
    }
}
