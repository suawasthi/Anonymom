package com.anom.Anonomous.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anom.Anonomous.utility.UserKeyGenratorUtility;

@RestController
public class MainController {
	@RequestMapping("createLink")
	public String createLink() {
		return UserKeyGenratorUtility.generateUserIndentifier();
		
	}
}
