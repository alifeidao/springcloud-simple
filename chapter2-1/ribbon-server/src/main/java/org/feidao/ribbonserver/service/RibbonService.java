package org.feidao.ribbonserver.service;

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

    public String index(){
        return restTemplate.getForObject("http://HELLOWORLDSERVICE/index",String.class);
    }
}
