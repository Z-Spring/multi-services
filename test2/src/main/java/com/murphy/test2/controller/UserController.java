package com.murphy.test2.controller;

import com.murphy.test4.service.BookService;
import com.murphy.test4.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Murphy
 */
@RestController
@Slf4j
public class UserController {
    @DubboReference
    UserService userService;
    @DubboReference(registry = "registry2")
    BookService bookService;
    @GetMapping("/user")
    public String getUser(){
        log.info(userService.getUser());
        log.info(bookService.getBook());
        return userService.getUser()+bookService.getBook();
    }
}
