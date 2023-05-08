package com.project.itfo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.itfo.service.SysCodeService;
import com.project.itfo.vo.SysCode;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestRestController {
	@Autowired
	private SysCodeService sysCodeService;
	
	@GetMapping("/test1")
	public String testController(){
        return "SUCCESS";
    }
	
	@GetMapping("/test2")
	public List<SysCode> findAll(){
		List<SysCode> sysList = this.sysCodeService.findAll();
		return sysList;
	}
}
