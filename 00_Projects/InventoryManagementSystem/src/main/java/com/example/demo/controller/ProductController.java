package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.constants.MessageConstants;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    // Add Product
    @PostMapping("/add")
    public String addProduct(@RequestBody Product product) {
         productService.addProduct(product);
         return MessageConstants.PRODUCT_ADDED;
    }

    // Get All Products
    @GetMapping("/getall")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // Get Product By ID
    @GetMapping("getproduct/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    // Update Product
    @PutMapping("/update/{id}/{product}")
    public String updateProduct(@PathVariable int id, @RequestBody Product product) {
         productService.updateProduct(id, product);
        return MessageConstants.PRODUCT_UPDATED;
    }

    // Delete Product
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
        return MessageConstants.PRODUCT_DELETED;
    }

    // Search By Name
    @GetMapping("/search/{name}")
    public List<Product> searchProduct(@PathVariable String name) {
        return productService.searchByName(name);
    }

    // Check Stock Status
    @GetMapping("/stock/{quantity}")
    public String checkStockStatus(@PathVariable int quantity) {
        return productService.CheckStockStatus(quantity);
    }

    // Total Inventory Value
    @GetMapping("/totalValue")
    public double calculateTotalInventoryValue() {
        return productService.calculateTotalInventoryValue();
    }

    // Get By Category
    @GetMapping("/category/{category}")
    public List<Product> getProductsByCategory(@PathVariable String category) {
        return productService.getProductsByCategory(category);
    }
}