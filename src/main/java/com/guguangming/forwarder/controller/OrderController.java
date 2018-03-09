package com.guguangming.forwarder.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by FUFAN on 2018/3/9.
 */
@Controller
@Api("AccountController")
@RequestMapping(value = "/order")
public class OrderController {

    @RequestMapping(path = "/check", method = RequestMethod.GET)
    public String check(){
        return "orderCheck";
    }

    @RequestMapping(path = "/orders", method = RequestMethod.GET)
    public String orders(){
        return "orderOrders";
    }
}
