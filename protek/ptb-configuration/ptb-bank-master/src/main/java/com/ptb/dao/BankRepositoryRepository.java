package com.ptb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ptb.model.Bank;


public interface BankRepositoryRepository extends JpaRepository<Bank, Integer>{

	
}
