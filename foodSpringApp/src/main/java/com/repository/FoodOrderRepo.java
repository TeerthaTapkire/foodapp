package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.FoodOrder;

public interface FoodOrderRepo extends JpaRepository<FoodOrder, Integer>{

}
