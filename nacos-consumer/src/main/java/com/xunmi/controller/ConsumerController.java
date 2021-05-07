package com.xunmi.controller;

import com.xunmi.feign.CallProviderFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xunmi
 * @ClassName NacosConsumer
 * @Description TODO
 * @date 2021/5/7
 * @since 1.0
 */

@RestController
public class ConsumerController {
    
    @Resource
    private CallProviderFeign callProviderFeign;

    @GetMapping("/hi")
    String hi() {
        return callProviderFeign.hello();
    }
}
