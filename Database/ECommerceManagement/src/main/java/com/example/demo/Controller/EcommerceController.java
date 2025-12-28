package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ECommerce;
import com.example.demo.Service.EcommerceService;

@RestController
@RequestMapping("ecommerce")
public class EcommerceController {

    @Autowired
    EcommerceService ecommerceService;

    @PostMapping("add")
    public String addProduct(@RequestBody ECommerce eCommerce) {
        ecommerceService.addProduct(eCommerce);
        return "Product Added in database";
    }

    @GetMapping("{id}")
    public ECommerce getProduct(@PathVariable int id) {
        return ecommerceService.getProduct(id);
    }

    @DeleteMapping("{id}")
    public String deleteProduct(@PathVariable int id) {
        ecommerceService.deleteProduct(id);
        return "Product Deleted from database!";
    }

}
