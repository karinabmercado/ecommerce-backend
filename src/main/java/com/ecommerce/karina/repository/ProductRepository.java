package com.ecommerce.karina.repository;

import com.ecommerce.karina.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
