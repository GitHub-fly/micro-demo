package com.xunmi.fallback;

import com.xunmi.feign.CallProviderFeign;
import org.springframework.stereotype.Component;

/**
 * @Author xunmi
 * @ClassName ProviderFallback
 * @Description TODO
 * @Date 2021/5/8
 * @Version 1.0.0
 */
@Component
public class ProviderFallback implements CallProviderFeign {

    @Override
    public String hello() {
        return "现在服务器忙，请稍后再试！";
    }
}

