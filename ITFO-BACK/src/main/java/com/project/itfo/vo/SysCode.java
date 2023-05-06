package com.project.itfo.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "SYS_CODE", schema = "itfo")
public class SysCode {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String main_cd;
	private String sub_cd;
	private String code_nm;
	private int mng_cd;
}
