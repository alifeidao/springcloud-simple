package org.feidao.feignserver.controller;

import org.feidao.feignserver.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by feidao on 2019-09-29.
 */
@RestController
public class FeignController {
    @Autowired
    private FeignService feignService;

    @RequestMapping(value = "/index")
    public String index(){
        return feignService.index();
    }

}
