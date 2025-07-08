package com.example.spring.data.jpa.repository;

import com.example.spring.data.jpa.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

//The implementation of OrderRepository will be completed by SpringDataJPA


public interface OrderRepository extends JpaRepository<Order, Long> {
}

