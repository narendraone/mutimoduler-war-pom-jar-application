package com.ptb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ptb.model.Doctor;
import com.ptb.service.DoctorService;



@RestController
public class DoctorController {

	@Autowired
	private DoctorService service;
	
	@GetMapping("/doctors")
	public List<Doctor> getDoctors() {
		return service.getDoctors();
	}
}
