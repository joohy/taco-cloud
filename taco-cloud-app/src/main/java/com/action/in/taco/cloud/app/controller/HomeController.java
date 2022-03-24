package com.action.in.taco.cloud.app.controller;

import com.action.in.taco.cloud.app.annotation.CustomAnnotation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Slf4j
@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @CustomAnnotation
    public void annotationTest(){

    }
}
