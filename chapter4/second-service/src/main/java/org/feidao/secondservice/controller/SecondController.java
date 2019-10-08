package org.feidao.secondservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by feidao on 2019-09-29.
 */
@RestController
public class SecondController {
    @RequestMapping(value = "/index")
    public String index(){
        return "second service：天天向上!";
    }
}
