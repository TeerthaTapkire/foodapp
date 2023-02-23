package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
