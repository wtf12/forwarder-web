package com.guguangming.forwarder.controller;

import com.guguangming.forwarder.dto.AdministratorInfoDto;
import com.guguangming.forwarder.service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by FUFAN on 2018/2/28.
 */
@Controller
@Api("LoginController")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String login(){
//        modelMap.put("error", error);

       return "login";
    }


    @ApiOperation(value = "PC端后台管理员登录校验")
    @RequestMapping(path = "/index", method = RequestMethod.POST)
    public String login(@ModelAttribute @Valid AdministratorInfoDto administratorInfoDto){
        boolean success = loginService.administratorLogin(administratorInfoDto);
        if (success){
            return "index";
        }else {
            return "login";
        }
    }

    /**
     * 后门，后期删除
     * @return
     */
    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
