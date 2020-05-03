package com.anom.Anonomous.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anom.Anonomous.pojo.Message;

@Controller
public class SendMessageController {
	
	@RequestMapping("/sendMessage/{userID}")
	public String getHomePage(Model model, @PathVariable String userID) {
		Message message = new Message();
		message.setId("232323");
		model.addAttribute("message", message);
		return "index.html";
	}
	
	@PostMapping("/submitMessage")
	public String SendMessage(@ModelAttribute Message msg) {
		System.out.println(msg.getContent());
		return "index.html";
	}
	

}
