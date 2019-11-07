package com.ptb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ptb.model.Bank;
import com.ptb.service.DoctorService;



@RestController
public class ConfigurationBankMasterController {

	@Autowired
	private DoctorService service;
	
	@GetMapping("/banks")
	public List<Bank> getDoctors() {
		return service.getDoctors();
	}
}
