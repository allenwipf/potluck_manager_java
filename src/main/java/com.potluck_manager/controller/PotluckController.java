package com.potluck_manager.controller;

import com.potluck_manager.model.Potluck;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class PotluckController {
    private ModelMap modelMap;

    @GetMapping("/potlucks")
    public String potluckForm(Model model) {
        model.addAttribute("potluck", new Potluck());
        return "potlucks";
    }

    @PostMapping("/potlucks")
    public String potluckSubmit(@ModelAttribute Potluck potluck) {
        return "potluck";
    }

}

////       Creates a potluck Object
//        Potluck potluck = new Potluck(1, "The BBQ", "The Wipf's Place","Smoked Brisket BBQ", 20);
//        modelMap.put("potluck", potluck);
