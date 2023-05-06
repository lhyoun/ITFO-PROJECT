package com.project.itfo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestRestController {
	
	@GetMapping("/test1")
	public String testController(){
        return "SUCCESS";
    }
}
