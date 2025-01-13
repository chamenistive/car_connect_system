package com.vehiclesales.car_connect_system.factory;

// import com.mysql.cj.x.protobuf.MysqlxCrud.Order;
import com.vehiclesales.car_connect_system.model.Vehicle;
import com.vehiclesales.car_connect_system.model.CashOrder;
import com.vehiclesales.car_connect_system.model.CreditOrder;
import com.vehiclesales.car_connect_system.model.Orrder;



public class OrderFactory {
    public static Orrder createOrder(String orderId, Vehicle vehicle, String paymentType) {
        if ("cash".equalsIgnoreCase(paymentType)) {
            return new CashOrder(orderId, vehicle, "In Progress...");
        } else if ("credit".equalsIgnoreCase(paymentType)) {
            return new CreditOrder(orderId, vehicle, "In Progress...");
        }
        throw new IllegalArgumentException("Invalid payment type: " + paymentType);
    }
}