package com.logoocc.controller;


import com.alibaba.fastjson.JSON;
import com.logoocc.model.User;
import com.logoocc.service.UserService;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by ms-zk on 2017-03-13.
 */
@Controller
@RequestMapping("/")
public class IndexController  {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public ModelAndView index( HttpServletResponse response )  throws  Exception{

       User user =  userService.selectByPrimaryKey(1);


        List<User> datausers= new ArrayList<User>();
        datausers.add(user);
        String jsonString = JSON.toJSONString(datausers);

        response.getWriter().write(jsonString);

        response.getWriter().flush();


        System.out.print("index page");
        // init the navbar data
        // List<PaperType>

        return null;
    }

}
