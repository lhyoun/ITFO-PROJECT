package com.project.itfo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.itfo.repository.SysCodeRepository;
import com.project.itfo.vo.SysCode;

@Service
public class SysCodeService {
	
	private SysCodeRepository sysCodeRepository;
	
	public SysCodeService(SysCodeRepository sysCodeRepository) {
		this.sysCodeRepository = sysCodeRepository;
	}
	
	public List<SysCode> findAll(){
		return this.sysCodeRepository.findAll();
	}
}
