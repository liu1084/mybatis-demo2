package com.jim.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jim on 2017/9/20.
 * This class is ...
 */
@Controller
public class HomeController {
    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public ModelAndView home(ModelAndView modelAndView){
        modelAndView.addObject("title", "Home");
        modelAndView.addObject("body", "test");
        modelAndView.setViewName("home");
        return modelAndView;
    }
}