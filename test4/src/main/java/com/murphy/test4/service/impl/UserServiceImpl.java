package com.murphy.test4.service.impl;

import com.murphy.test4.service.UserService;
import lombok.extern.apachecommons.CommonsLog;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * @author Murphy
 */
@DubboService
@Component
public class UserServiceImpl implements UserService {

    @Override
    public String getUser() {
        return "zhangsan";
    }

    @Override
    public String getUserById() {
        return null;
    }
}
