package com.ssm.controller;

import com.ssm.model.nochange.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by chenhansen on 2018/5/21.
 */
@Controller
@RequestMapping("/user")

public class MainController {

    @Autowired
    private UserService userService;



    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(HttpServletRequest request){
        String username=(String)request.getParameter("username");
        String password=(String)request.getParameter("password");
        if(username==null||password==null)
            return "fail";
        if(username.equals("hansen")&&password.equals("123456"))
            return "success";
        else return "fail";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(@ModelAttribute User user){

        userService.saveUser(user);
        return "success";
    }

    @RequestMapping(value = "/tologin",method = RequestMethod.GET)
    public String tologin(){

        return "login";
    }

    @RequestMapping(value = "/toregister",method = RequestMethod.GET)
    public String toregister(){

        return "register";
    }


}
