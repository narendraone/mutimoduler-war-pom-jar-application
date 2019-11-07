package com.ptb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ptb.model.Doctor;


public interface DoctorRepository extends JpaRepository<Doctor, Integer>{

	
}
