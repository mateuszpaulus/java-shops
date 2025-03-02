package com.java_ecommerce.java_shops.service.product;

import com.java_ecommerce.java_shops.dto.ProductDto;
import com.java_ecommerce.java_shops.model.Product;
import com.java_ecommerce.java_shops.request.AddProductRequest;
import com.java_ecommerce.java_shops.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest product);

    Product getProductById(Long id);

    Product deleteProductById(Long id);

    Product updateProduct(ProductUpdateRequest product, Long productId);

    List<Product> getAllProducts();

    List<Product> getProductsByCategory(String category);

    List<Product> getProductsByBrand(String brand);

    List<Product> getProductsByName(String name);

    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    
    List<Product> getProductsByBrandAndName(String brand, String name);

    Long countProductsByBrandAndName(String brand, String name);

    List<ProductDto> getConvertProductsToDto(List<Product> products);

    ProductDto convertToDto(Product product);
}
