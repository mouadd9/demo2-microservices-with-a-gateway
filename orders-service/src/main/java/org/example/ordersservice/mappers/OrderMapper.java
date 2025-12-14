package org.example.ordersservice.mappers;

import org.example.ordersservice.dtos.OrderDTO;
import org.example.ordersservice.entities.Order;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {
    public OrderDTO fromOrder(Order order){
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(order, orderDTO);
        return orderDTO;
    }

    public Order fromOrderDTO(OrderDTO orderDTO){
        Order order = new Order();
        BeanUtils.copyProperties(orderDTO, order);
        return order;
    }
}
