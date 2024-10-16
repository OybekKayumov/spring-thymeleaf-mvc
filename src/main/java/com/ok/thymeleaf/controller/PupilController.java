package com.ok.thymeleaf.controller;

import com.ok.thymeleaf.model.Pupil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PupilController {

    @GetMapping("/")
    public String showForm(Model model) {
        //Pupil pupil = new Pupil();
        //model.addAttribute("pupil", pupil);
        model.addAttribute("pupil", new Pupil());
        return "pupil-form";
    }
}
