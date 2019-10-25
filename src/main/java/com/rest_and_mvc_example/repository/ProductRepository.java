package com.rest_and_mvc_example.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.rest_and_mvc_example.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}