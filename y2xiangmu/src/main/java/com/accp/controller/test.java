package com.accp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class test {
	
	@RequestMapping("toTest")
	public String toTest() {
		return "hellowWorld";
	}
	
}
