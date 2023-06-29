package com.myshop.shoppingMall.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainController {
	@GetMapping("/")
	public String shopMain() {
		return "shopMian";
	}
	
	@RequestMapping("/list")
	public String memberList() {
		return "/pages/memberList";
	}
}
