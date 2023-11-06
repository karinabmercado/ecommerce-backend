package com.ecommerce.karina.repository;

import com.ecommerce.karina.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
