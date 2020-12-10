package com.ies.kentucky.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ies.kentucky.admin.entity.Citizen;
import com.ies.kentucky.admin.entity.CitizenInformation;
import com.ies.kentucky.admin.service.ICitizenService;

@Controller
public class CitizenController {
	@Autowired
	private ICitizenService cservice;

	

	@GetMapping("/show")
	public String showCitizen(Model model) {
		CitizenInformation citz = new CitizenInformation();
		model.addAttribute("citz", citz);
		return "ApplicatonRegister";
	}

	@PostMapping("/register")
	public String registerCitizen(CitizenInformation cInfo, RedirectAttributes model) {
	
			Boolean isSaved = cservice.registerCitizen(cInfo);
			if (isSaved) {
				model.addFlashAttribute("success", "User Registerd successfuui..");

			} else {
				model.addFlashAttribute("fail", "something went wrong");
			}

		
		return "redirect:/show";

	}
   

}
