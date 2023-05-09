package com.project.itfo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.itfo.repository.SysCodeRepository;
import com.project.itfo.vo.SysCode;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SysCodeService {
	
	private final SysCodeRepository sysCodeRepository;
	
	public List<SysCode> findAll(){
		return this.sysCodeRepository.findAll();
	}
}
