package com.example.womenmenwebsite.controller;

import com.example.womenmenwebsite.constants.EndPoints;
import com.example.womenmenwebsite.dto.request.UserCreateRequestDto;
import com.example.womenmenwebsite.repository.entity.EGender;
import com.example.womenmenwebsite.repository.entity.User;
import com.example.womenmenwebsite.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@RequiredArgsConstructor
@Controller
@RequestMapping(EndPoints.VERSION + EndPoints.API + EndPoints.LOGIN)
public class LoginController {
    private final UserService userService;

    @GetMapping(EndPoints.LOGINPAGE)
    public ModelAndView loginPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        String username = "Username";
        String pass = "Password";

        return modelAndView;
    }

    @PostMapping("/dologin")
    public ModelAndView doLogin(String txtusername, String txtpassword) {
        Optional<User> user = userService.findByUsernameAndPassword(txtusername, txtpassword);

        if (user.get().getGender().equals(EGender.WOMEN)) {
            ModelAndView modelAndView = new ModelAndView("homewomenpage");
            modelAndView.addObject("username", user.get().getName());
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("homemanpage");
            modelAndView.addObject("username", user.get().getName());
            return modelAndView;
        }
    }

    @GetMapping("/registerpage")
    public ModelAndView register() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("register");
        return modelAndView;
    }


    @PostMapping("/doregister")
    public ModelAndView save(UserCreateRequestDto dto) {
        userService.save(dto);
        return new ModelAndView("redirect:loginpage");
    }


}


