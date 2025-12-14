package org.example.productsservice;

import org.example.productsservice.entities.Product;
import org.example.productsservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
            productRepository.save(Product.builder().name("Laptop Dell XPS").price(12000).quantity(10).build());
            productRepository.save(Product.builder().name("Smartphone Samsung Galaxy").price(8000).quantity(20).build());
            productRepository.save(Product.builder().name("Ecran 4K LG").price(3500).quantity(15).build());
        };
    }
}
