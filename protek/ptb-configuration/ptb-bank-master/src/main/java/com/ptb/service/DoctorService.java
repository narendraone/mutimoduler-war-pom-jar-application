package com.ptb.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptb.dao.BankRepositoryRepository;
import com.ptb.model.Bank;


@Service
public class DoctorService {


	
	@Autowired
	private BankRepositoryRepository repository;

	@PostConstruct
	public void initBank() {

		repository.saveAll(Stream.of(
				new Bank(101, "SBI", "Madhapur"),
				new Bank(102, "HDFC", "Kondapur")
				).collect(Collectors.toList()));
	}
	
	public List<Bank> getDoctors() {

		return repository.findAll();
	}

}
