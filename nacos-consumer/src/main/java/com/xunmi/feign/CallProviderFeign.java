package com.xunmi.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author xunmi
 * @ClassName CallProviderFeign
 * @Description TODO
 * @Date 2021/5/7
 * @Version 1.0.0
 */
@FeignClient("nacos-provider")
public interface CallProviderFeign {

    /**
     * 远程调用生产者的hello接口
     * @return String
     */
    @RequestMapping("hello")
    String hello();
}
