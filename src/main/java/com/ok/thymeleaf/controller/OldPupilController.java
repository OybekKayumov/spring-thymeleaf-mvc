package com.ok.thymeleaf.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class OldPupilController {

	@RequestMapping("/showPupilForm")
	public String showPupilForm() {
		return "old-pupil-form";
	}

	@RequestMapping("/processPupilForm")
	public String processPupilForm() {
		return "pupil-info";
	}

	@RequestMapping("/processPupilFormV2")
	public String correctName(
					HttpServletRequest request, Model model) { //* to get data

		String oldNameLC = request.getParameter("pupilName").toLowerCase();
		String correctName = "";
		String[] words = oldNameLC.split(" ");

		for (String word : words) {
			String first = word.substring(0, 1).toUpperCase();
			word = first + word.substring(1);
			correctName += word + " ";
		}

		correctName = correctName.trim();  //* remove last space
		model.addAttribute("correctName", correctName);
		return "pupil-info";
	}

	@RequestMapping(value = "/processPupilFormV3", method = RequestMethod.POST)
	//@GetMapping("/processPupilFormV3")
	//! @PostMapping("/processPupilFormV3") ERR
	public String correctName3(
					@RequestParam("pupilName") String pupilName , Model model) { //* to
		// get data

		String oldNameLC = pupilName.toLowerCase();
		String correctName = "";
		String[] words = oldNameLC.split(" ");

		for (String word : words) {
			String first = word.substring(0, 1).toUpperCase();
			word = first + word.substring(1);
			correctName += word + " ";
		}

		correctName = correctName.trim();  //* remove last space
		model.addAttribute("correctName", correctName);
		return "pupil-info";
	}
}
