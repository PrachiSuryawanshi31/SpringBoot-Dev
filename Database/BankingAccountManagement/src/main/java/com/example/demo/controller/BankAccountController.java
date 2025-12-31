package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.BankAccount;
import com.example.demo.service.BankService;

@RestController
@RequestMapping("bank")
public class BankAccountController {

    @Autowired
    private BankService bankService;

    
    @PostMapping("add")
    public String addAccount(@RequestBody BankAccount bankAccount) {
        bankService.createAccount(bankAccount);
        return "Bank Account Created Successfully!";
    }


    @GetMapping("/{id}")
    public BankService getAccount(@PathVariable int id) {
        return bankService.getAccount(id);   
    }

    
    @DeleteMapping("/{id}")
    public String deleteAccount(@PathVariable int id) {
        bankService.deleteAccount(id);
        return "Bank Account Deleted Successfully!";
    }
}
