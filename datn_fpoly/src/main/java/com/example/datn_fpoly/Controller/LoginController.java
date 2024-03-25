package com.example.datn_fpoly.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.UUID;

@Controller
public class LoginController {
    @GetMapping("/login")
    public ModelAndView login(){
        return new ModelAndView("/login/Login");
    }

}
