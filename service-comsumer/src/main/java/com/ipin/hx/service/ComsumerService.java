package com.ipin.hx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by janze on 7/6/18.
 */
@FeignClient(name = "service-provider", fallback = ComsumerServiceImpl.class)
public interface ComsumerService {


    @RequestMapping("/service-instances/usage")
    String usage();
}


