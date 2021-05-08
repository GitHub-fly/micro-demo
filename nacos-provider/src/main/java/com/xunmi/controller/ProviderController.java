package com.xunmi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xunmi
 * @ClassName ProviderController
 * @Description TODO
 * @date 2021/5/7
 * @since 1.0
 */
@RestController
@RefreshScope
public class ProviderController {
    @Value("${myName}")
    private String name;

    @GetMapping("/hello")
    public String hello() {
        int a = 3 / 0;
        return "hello " + name;
    }
}
