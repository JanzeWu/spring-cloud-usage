package com.ipin.hx.service;

import org.springframework.stereotype.Component;

/**
 * Created by janze on 7/6/18.
 */
@Component
public class ComsumerServiceImpl implements ComsumerService {

    @Override
    public String usage() {
        return "default string";
    }
}
