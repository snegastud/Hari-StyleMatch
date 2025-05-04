package com.example.StyleMatch.controller;

import com.example.StyleMatch.model.ProductOrder;
import com.example.StyleMatch.service.ProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class OrderController {
    @Autowired
    private final ProductOrderService service;

    public OrderController(ProductOrderService service) {
        this.service = service;
    }

    @PostMapping("/order")
    public String placeOrder(@ModelAttribute ProductOrder order) {
        service.save(order);
        return "order successfully...!"; // Create this HTML file
    }
}
