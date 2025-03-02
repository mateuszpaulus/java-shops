package com.java_ecommerce.java_shops.request;

import com.java_ecommerce.java_shops.model.Category;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductUpdateRequest {
    private Long id;
    private String description;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private Category category;
}
