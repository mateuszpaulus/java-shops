package com.java_ecommerce.java_shops.service.order;

import com.java_ecommerce.java_shops.dto.OrderDto;
import com.java_ecommerce.java_shops.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);

    OrderDto getOrder(Long orderId);

    List<OrderDto> getUserOrders(Long userId);
}
