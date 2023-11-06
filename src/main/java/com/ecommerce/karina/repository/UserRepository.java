package com.ecommerce.karina.repository;

import com.ecommerce.karina.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
