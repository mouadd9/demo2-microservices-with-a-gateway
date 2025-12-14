package org.example.ordersservice.client;

import org.example.ordersservice.client.dto.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// URL will be defined in application.properties
@FeignClient(name = "products-service", url = "http://products-service:8080")
public interface ProductRestClient {
    @GetMapping("/api/products/{id}")
    ProductDTO findProductById(@PathVariable Long id);
}
