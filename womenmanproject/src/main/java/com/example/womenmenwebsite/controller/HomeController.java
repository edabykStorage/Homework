package com.example.womenmenwebsite.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("/womenhome")
    public ModelAndView womenHomePage(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("homewomenpage");

        return modelAndView;
    }

    @GetMapping("/manhome")
    public ModelAndView manHomePage(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("homemanpage");
        return modelAndView;
    }

}
