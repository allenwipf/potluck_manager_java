package com.potluck_manager.controller;


import com.potluck_manager.model.Potluck;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticPageController {
    private ModelMap modelMap;

    @RequestMapping("/")
    public String showHome(){

        return "index";
    }

}





