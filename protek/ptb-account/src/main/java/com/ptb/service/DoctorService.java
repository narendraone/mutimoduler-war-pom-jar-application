package com.ptb.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptb.dao.DoctorRepository;
import com.ptb.model.Doctor;


@Service
public class DoctorService {


	
	@Autowired
	private DoctorRepository repository;

	@PostConstruct
	public void initDoctor() {

		repository.saveAll(Stream.of(
				new Doctor(101, "John", "Cardiac"),
				new Doctor(102, "Peter", "eye")
				).collect(Collectors.toList()));
	}
	
	public List<Doctor> getDoctors() {

		return repository.findAll();
	}

}
