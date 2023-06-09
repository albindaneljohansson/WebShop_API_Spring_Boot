package com.example.webshop_api_spring.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class OrderEntry {

    @Id
    @GeneratedValue
    private long id;

    private int quantity;

    @ManyToOne
    @JoinColumn
    private Item item;

    public OrderEntry(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

}
