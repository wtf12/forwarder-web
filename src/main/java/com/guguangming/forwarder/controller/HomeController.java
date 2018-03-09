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
@RequestMapping(value = "/home")
public class HomeController {

    @RequestMapping(path = "/banner", method = RequestMethod.GET)
    public String banner(){
        return "homeBanner";
    }

    @RequestMapping(path = "/news", method = RequestMethod.GET)
    public String news(){
        return "homeNews";
    }

    @RequestMapping(path = "/announcement", method = RequestMethod.GET)
    public String announcement(){
        return "homeAnnouncement";
    }

    @RequestMapping(path = "/schedule", method = RequestMethod.GET)
    public String schedule(){
        return "homeSchedule";
    }
}
