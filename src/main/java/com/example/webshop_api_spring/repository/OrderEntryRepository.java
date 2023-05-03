package com.example.webshop_api_spring.repository;


import com.example.webshop_api_spring.model.OrderEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderEntryRepository extends JpaRepository<OrderEntry, Long> {
}
