package com.example.webshop_api_spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddItemRequest {

    private long customerId;
    private long orderId;
    private long itemId;
    private int quantity;

}
