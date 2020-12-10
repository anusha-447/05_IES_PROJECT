package com.ies.kentucky.admin.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ies.kentucky.admin.entity.Citizen;

@RestController
@RequestMapping("/ssnVerify")
public class SsnVerifyRestController {
	
	 @GetMapping("/verify")
		private String callSSNWebApi(@RequestParam("ssn") Long ssn) {
			String data = "";
			
			String ssnWeburl = "http://localhost:8900/ssnVerfication/getCitizenData/";
			
			 RestTemplate rt=new RestTemplate();
			
			ResponseEntity<Citizen> forEntity = rt.getForEntity(ssnWeburl+ssn, Citizen.class);
			System.out.println(forEntity);
			int statusCodeValue = forEntity.getStatusCodeValue();
			
			System.out.println(statusCodeValue);
			
			if (statusCodeValue==200) {
				System.out.println("e");
				data = "EXISTED";
			} else {
				System.out.println("no");
				data = "NOT EXISTED";
			}
			return data;
		}

}
