package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.BloodStock;

public interface BloodStockRepository extends JpaRepository<BloodStock, Integer>{

}
