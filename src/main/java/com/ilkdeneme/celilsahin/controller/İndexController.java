package com.ilkdeneme.celilsahin.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api")
@RequiredArgsConstructor
public class İndexController {

    private final PersonelController personelController;

    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView model = new ModelAndView();
        model.setViewName("index");
        return model;
    }
}
