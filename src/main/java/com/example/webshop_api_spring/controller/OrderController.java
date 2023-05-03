package com.example.webshop_api_spring.controller;


import com.example.webshop_api_spring.model.CustomerOrder;
import com.example.webshop_api_spring.repository.CustomerOrderRepository;
import com.example.webshop_api_spring.repository.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    private final CustomerRepository customerRepository;
    private final CustomerOrderRepository customerOrderRepository;

    public OrderController(CustomerRepository customerRepository, CustomerOrderRepository customerOrderRepository) {
        this.customerRepository = customerRepository;
        this.customerOrderRepository = customerOrderRepository;
    }

    @GetMapping("/orders")
    public List<CustomerOrder> getAllOrders() {
        return customerOrderRepository.findAll();
    }

    @GetMapping("/orders/{customerId}")
    public List<CustomerOrder> getOrdersByCustomerId(@PathVariable long customerId) {
        return customerOrderRepository.findByCustomerId(customerId);
    }

}
