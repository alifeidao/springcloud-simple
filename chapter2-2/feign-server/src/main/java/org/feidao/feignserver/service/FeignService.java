package org.feidao.feignserver.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by feidao on 2019-09-29.
 * 定义Feign接口
 */
@FeignClient(value = "HelloWorldService")
public interface FeignService {
    @RequestMapping(value = "/index")
    public String index();
}
