package org.example.ordersservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class OrderDTO {
    private Long id;
    private Long productId;
    private Long userId;
    private int quantity;
    private LocalDateTime orderDate;
}
