package com.example.demo.service;

import com.example.demo.entity.CollegeAdmission;

public interface CollegeAdmissionService {

    void addAdmission(CollegeAdmission admission);


    void deleteAdmission(int id);
    
    CollegeAdmission getAdmission(int id);
}
