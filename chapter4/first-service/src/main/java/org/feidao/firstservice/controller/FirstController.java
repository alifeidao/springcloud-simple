package org.feidao.firstservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by feidao on 2019-09-27.
 */
@RestController
public class FirstController {
    @RequestMapping(value = "/index")
    public String index(){
        return "first srvice：好好学习!";
    }

}
