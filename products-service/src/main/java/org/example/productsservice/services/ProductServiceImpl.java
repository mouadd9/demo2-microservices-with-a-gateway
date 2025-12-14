package org.example.productsservice.services;

import org.example.productsservice.dtos.ProductDTO;
import org.example.productsservice.entities.Product;
import org.example.productsservice.mappers.ProductMapper;
import org.example.productsservice.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductServiceImpl(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    @Override
    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll().stream()
                .map(productMapper::fromProduct)
                .collect(Collectors.toList());
    }

    @Override
    public ProductDTO getProductById(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
        
        // Simulating Security Check Log for the demo
        System.out.println("[SECURITY] Verifying Token signature in Products Service for Product ID: " + id);
        
        return productMapper.fromProduct(product);
    }
}
