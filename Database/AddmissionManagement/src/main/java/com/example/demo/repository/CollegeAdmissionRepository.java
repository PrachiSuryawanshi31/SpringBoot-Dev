package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.CollegeAdmission;

public interface CollegeAdmissionRepository extends JpaRepository<CollegeAdmission, Integer> {

}
