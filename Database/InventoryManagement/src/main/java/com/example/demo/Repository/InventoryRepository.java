package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Inventor;

public interface InventoryRepository extends JpaRepository<Inventor, Integer>{

}
