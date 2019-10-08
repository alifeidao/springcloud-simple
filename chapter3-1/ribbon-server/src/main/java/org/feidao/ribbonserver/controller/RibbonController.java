package org.feidao.ribbonserver.controller;

import org.feidao.ribbonserver.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by feidao on 2019-09-27.
 */
@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @RequestMapping(value = "/index")
    public String index(){
        return ribbonService.index();
    }
}
