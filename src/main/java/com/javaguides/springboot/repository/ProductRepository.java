package com.javaguides.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.javaguides.springboot.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}