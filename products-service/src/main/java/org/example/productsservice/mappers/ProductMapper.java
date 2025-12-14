package org.example.productsservice.mappers;

import org.example.productsservice.dtos.ProductDTO;
import org.example.productsservice.entities.Product;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;

@Component
public class ProductMapper {
    public ProductDTO fromProduct(Product product){
        ProductDTO productDTO = new ProductDTO();
        BeanUtils.copyProperties(product, productDTO);
        return productDTO;
    }

    public Product fromProductDTO(ProductDTO productDTO){
        Product product = new Product();
        BeanUtils.copyProperties(productDTO, product);
        return product;
    }
}
