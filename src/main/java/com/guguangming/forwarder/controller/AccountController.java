package com.guguangming.forwarder.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by FUFAN on 2018/2/28.
 */
@Controller
@Api("AccountController")
@RequestMapping(value = "/user")
public class AccountController {

    /**
     * 可通过链接直接访问，不安全，如有必要，可通过spring-security控制
     * @return
     */
    @RequestMapping(path = "/account", method = RequestMethod.GET)
    public String account(){
        return "account";
    }

}
