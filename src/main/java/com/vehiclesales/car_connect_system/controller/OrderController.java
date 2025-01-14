// package com.vehiclesales.car_connect_system.controller;


// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

// import com.mysql.cj.x.protobuf.MysqlxCrud.Order;
// import com.vehiclesales.car_connect_system.service.OrderService;

// @RestController
// @RequestMapping("/api/orders")
// public class OrderController {
//     @Autowired
//     private OrderService orderService;

//     @PostMapping
//     public ResponseEntity<Order> createOrder(@RequestBody Order order) {
//         Order createdOrder = orderService.createOrder(order);
//         return ResponseEntity.ok(createdOrder);
//     }
// }
package com.vehiclesales.car_connect_system.controller;

import com.vehiclesales.car_connect_system.model.Orrder;
import com.vehiclesales.car_connect_system.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public Orrder createOrder(@RequestBody Orrder order) {
        return orderService.createOrder(order);
    }
}