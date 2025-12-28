package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ECommerce;
import com.example.demo.repository.EcommerceRepository;

@Service
public class EcommerceServiceImpl implements EcommerceService {

    @Autowired
    EcommerceRepository ecommerceRepository;

    @Override
    public void addProduct(ECommerce eCommerce) {
        ecommerceRepository.save(eCommerce);
    }

    @Override
    public void deleteProduct(int id) {
        ecommerceRepository.deleteById(id);
    }

    @Override
    public ECommerce getProduct(int id) {
        return ecommerceRepository.findById(id).get();
    }

}
