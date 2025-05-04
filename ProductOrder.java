package com.example.StyleMatch.model;
import jakarta.persistence.*;

@Entity
public class ProductOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productNames;
    private String quantities;
    private int total;

    // No-arg constructor
    public ProductOrder() {
    }

    // All-args constructor
    public ProductOrder(Long id, String productNames, String quantities, int total) {
        this.id = id;
        this.productNames = productNames;
        this.quantities = quantities;
        this.total = total;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductNames() {
        return productNames;
    }

    public void setProductNames(String productNames) {
        this.productNames = productNames;
    }

    public String getQuantities() {
        return quantities;
    }

    public void setQuantities(String quantities) {
        this.quantities = quantities;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}

