package com.example.productapp_backend.Dao;


import com.example.productapp_backend.Model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product, Integer> {
}
