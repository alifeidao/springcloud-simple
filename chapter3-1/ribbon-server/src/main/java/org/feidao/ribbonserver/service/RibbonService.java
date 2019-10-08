package org.feidao.ribbonserver.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.utils.FallbackMethod;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by feidao on 2019-09-27.
 */
@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "indexError")
    public String index(){
        return restTemplate.getForObject("http://HELLOWORLDSERVICE/index",String.class);
    }

    public String indexError(){
        return "Ribbon Hystrix!";
    }


}
