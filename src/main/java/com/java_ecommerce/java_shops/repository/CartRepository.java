package com.java_ecommerce.java_shops.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.java_ecommerce.java_shops.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
