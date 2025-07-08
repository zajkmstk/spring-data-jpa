package com.example.spring.data.jpa.service;

import com.example.spring.data.jpa.entities.Order;
import com.example.spring.data.jpa.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private OrderRepository repository;

    public OrderService(@Autowired OrderRepository repository){
        this.repository = repository;

    }

    // Method to save Order Entity
    public Order saveOrder(Order order){
        Order newOrder = repository.save(order);
        return newOrder;
    }

    public Iterable<Order> findAll(){
        Iterable<Order> list = this.repository.findAll();
        return list;
    }
}