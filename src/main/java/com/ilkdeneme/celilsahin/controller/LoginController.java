package com.ilkdeneme.celilsahin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api")
//@RequiredArgsConstructor
public class LoginController {


   // private final PersonelController personelController;

    @GetMapping("/login")
    public ModelAndView login(){
        ModelAndView model = new ModelAndView();
        model.setViewName("login");
        return model;
    }
}
