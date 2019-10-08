package org.feidao.chapter1.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by feidao on 2019-09-26.
 */
@RestController
public class HelloWordController {
    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/index")
    public String index(){
        return "port:" + port + " " +  "Hello Word!" ;
    }

}
