package com.grocery.order.repository;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderEntity {
    private String orderId;
    private String orderDate;
}
