package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.CollegeAdmission;
import com.example.demo.service.CollegeAdmissionService;

@RestController
@RequestMapping("admission")
public class CollegeAdmissionController {

    @Autowired
    CollegeAdmissionService collegeAdmissionService;

    @PostMapping("/add")
    public String addAdmission(@RequestBody CollegeAdmission admission) {
        collegeAdmissionService.addAdmission(admission);
        
        return "Admission Added in Database";
    }

    

    @DeleteMapping("/{id}")
    public String deleteAdmission(@PathVariable int id) {
        collegeAdmissionService.deleteAdmission(id);
        
        return"Admission Deleted from database";
    }
    
    @GetMapping("/{id}")
    public CollegeAdmission getAdmission(@PathVariable int id) {
        return collegeAdmissionService.getAdmission(id);
    }
}
