package com.java_ecommerce.java_shops.service.cart;

import com.java_ecommerce.java_shops.model.Cart;

import java.math.BigDecimal;
import java.util.List;

public interface ICartService {
    Cart getCart(Long id);

    void clearCart(Long id);

    BigDecimal getTotalPrice(Long id);

    Long initializeNewCart();

    Cart getCartByUserId(Long userId);

    List<Cart> getAllCarts();
}
