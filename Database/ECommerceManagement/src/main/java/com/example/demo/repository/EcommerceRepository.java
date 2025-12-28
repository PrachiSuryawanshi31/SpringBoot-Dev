package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ECommerce;

public interface EcommerceRepository extends JpaRepository<ECommerce, Integer> {

}
