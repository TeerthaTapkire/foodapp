package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
	Customer findByEmail(String email);

}
