package org.feidao.feignserver.service;

import org.springframework.stereotype.Component;

/**
 * Created by feidao on 2019-09-29.
 * 定义Feign接口的容错处理
 */
@Component
public class FeignServiceHystric implements FeignService{
    @Override
    public String index() {
        return "Feign Hystrix!";
    }
}
