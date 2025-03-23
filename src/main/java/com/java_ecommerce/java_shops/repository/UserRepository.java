package com.java_ecommerce.java_shops.repository;

import com.java_ecommerce.java_shops.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
}
