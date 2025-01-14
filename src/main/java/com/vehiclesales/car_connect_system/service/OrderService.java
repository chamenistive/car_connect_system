package com.vehiclesales.car_connect_system.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// import com.mysql.cj.x.protobuf.MysqlxCrud.Order;
// import com.mysql.cj.x.protobuf.MysqlxCrud.Order;
import com.vehiclesales.car_connect_system.model.Orrder;
import com.vehiclesales.car_connect_system.repository.OrderRepository;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Orrder createOrder(Orrder order) {
        return orderRepository.save(order);
    }
}