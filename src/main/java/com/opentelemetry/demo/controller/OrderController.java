package com.opentelemetry.demo.controller;

import com.opentelemetry.demo.service.GetOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    GetOrder getOrder;

    @GetMapping(value = "/v1/orders")
    public String getOrders() throws InterruptedException {
        return getOrder.getOrders();
    }

    @GetMapping(value = "/v1/firstHello")
    public String getFirstHello() {
        return "first hello";
    }

}
