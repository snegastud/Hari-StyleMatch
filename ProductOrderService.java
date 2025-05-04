package com.example.StyleMatch.service;

import com.example.StyleMatch.model.ProductOrder;
import com.example.StyleMatch.repository.ProductOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductOrderService {
    @Autowired
    private final ProductOrderRepository repo;

    public ProductOrderService(ProductOrderRepository repo) {
        this.repo = repo;
    }

    public void save(ProductOrder order) {
        repo.save(order);
    }
}
