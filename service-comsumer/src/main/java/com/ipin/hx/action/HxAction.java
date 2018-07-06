package com.ipin.hx.action;

import com.ipin.hx.service.ComsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by janze on 7/5/18.
 */
@RestController
public class HxAction {

    @Autowired
    private ComsumerService comsumerService;

    @RequestMapping(value = "/usage", method = RequestMethod.GET)
    public String serviceProviderUsage(){

        return comsumerService.usage();
    }

}
