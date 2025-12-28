package com.example.demo.Service;

import com.example.demo.entity.ECommerce;

public interface EcommerceService {

    void addProduct(ECommerce eCommerce);

    void deleteProduct(int id);

    ECommerce getProduct(int id);

}
