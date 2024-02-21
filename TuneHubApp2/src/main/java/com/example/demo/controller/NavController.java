package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController 
{
	
	@GetMapping("/")
	public String index()	
	{
		return "index";
	}
	
	@GetMapping("/map-register")
	public String registerMapping()	
	{
		return "register";
	}
	
	@GetMapping("/map-login")
	public String loginMapping()	
	{
		return "login";
	}
	
	@GetMapping("/map-songs")
	public String songMapping()	
	{
		return "addsongs";
	}
	
	
	
	
	
}
