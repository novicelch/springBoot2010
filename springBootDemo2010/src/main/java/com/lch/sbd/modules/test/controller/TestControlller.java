package com.lch.sbd.modules.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestControlller {
	
	@RequestMapping("/test/appDesc")
	@ResponseBody
	public String getDsc(){
		return "Hello word,this is my first Spring boot demo.";
	}
}
