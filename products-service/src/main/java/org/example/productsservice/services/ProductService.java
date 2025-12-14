package org.example.productsservice.services;

import org.example.productsservice.dtos.ProductDTO;
import java.util.List;

public interface ProductService {
    List<ProductDTO> getAllProducts();
    ProductDTO getProductById(Long id);
}
