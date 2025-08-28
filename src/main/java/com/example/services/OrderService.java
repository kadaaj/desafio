package com.example.services;

import com.example.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final ShippingService shippingService;

    @Autowired
    public OrderService(ShippingService shippingService){
        this.shippingService = shippingService;
    }

    public double total(Order order){
        double discountedValue = order.getBasic() * (1 - order.getDiscount() / 100);

        double shippingCost = shippingService.shipment(order);

        return discountedValue + shippingCost;
    }
}
