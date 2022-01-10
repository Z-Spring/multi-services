package com.murphy.test4.service.impl;

import com.murphy.test4.service.BookService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * @author Murphy
 */
@DubboService(registry = {"registry1","registry2"})
@Component
public class BookServiceImpl implements BookService {
    /**
     * 获取书籍
     */
    @Override
    public String getBook() {
        return "马克思主义";
    }
}
