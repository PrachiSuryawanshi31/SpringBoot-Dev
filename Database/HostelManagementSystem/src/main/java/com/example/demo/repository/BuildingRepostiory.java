package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Building;

public interface BuildingRepostiory extends JpaRepository<Building, Integer> {

}
