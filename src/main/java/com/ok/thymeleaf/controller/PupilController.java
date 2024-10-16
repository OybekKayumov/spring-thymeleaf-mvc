package com.ok.thymeleaf.controller;

import com.ok.thymeleaf.model.Pupil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PupilController {

    @GetMapping("/showPupilForm")
    public String showForm(Model model) {
        //Pupil pupil = new Pupil();
        //model.addAttribute("pupil", pupil);
        model.addAttribute("pupil", new Pupil());
        return "pupil-form";
    }

    @PostMapping("/processPupilForm")
    public String processPupilForm(@ModelAttribute("pupil") Pupil pupil) {
        System.out.println(pupil);

        return "pupil-confirmation";
    }
}
