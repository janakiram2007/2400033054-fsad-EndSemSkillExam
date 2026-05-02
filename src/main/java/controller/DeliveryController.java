package com.example.deliveryapi.controller;

import com.example.deliveryapi.model.Delivery;
import com.example.deliveryapi.repository.DeliveryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    private DeliveryRepository repository;

    @GetMapping("/hello")
    public String hello() {
        return "Hello Working";
    }

    @GetMapping("/test")
    public String test() {
        return "Working";
    }

    @PostMapping
    public Delivery addDelivery(@RequestBody Delivery delivery) {
        return repository.save(delivery);
    }

    @DeleteMapping("/{id}")
    public String deleteDelivery(@PathVariable Long id) {
        repository.deleteById(id);
        return "Deleted successfully";
    }
}