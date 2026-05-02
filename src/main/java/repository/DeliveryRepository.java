package com.example.deliveryapi.repository;

import com.example.deliveryapi.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
}