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
@RequestMapping(value = "/company")
public class CompanyController {

    @RequestMapping(path = "/banner", method = RequestMethod.GET)
    public String banner(){
        return "companyBanner";
    }

    @RequestMapping(path = "/synopsis", method = RequestMethod.GET)
    public String synopsis(){
        return "companySynopsis";
    }

    @RequestMapping(path = "/business", method = RequestMethod.GET)
    public String business(){
        return "companyBusiness";
    }

    @RequestMapping(path = "/certificate", method = RequestMethod.GET)
    public String certificate(){
        return "companyCertificate";
    }

    @RequestMapping(path = "/project", method = RequestMethod.GET)
    public String project(){
        return "companyProject";
    }

    @RequestMapping(path = "/employees", method = RequestMethod.GET)
    public String employees(){
        return "companyEmployees";
    }
}
