package com.wannacode.bookingmicroservice.controller;

import com.wannacode.bookingmicroservice.dto.OrderDTO;
import com.wannacode.bookingmicroservice.entity.Order;
import com.wannacode.bookingmicroservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/booking")
public class BookingController {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/order")
    public String saveOrder(@RequestBody OrderDTO orderDTO) {

        Order order = new Order();

        order.setOrderNo(UUID.randomUUID().toString());
        order.setOrderItems(orderDTO.getOrderItems());

        orderRepository.save(order);

        return "Order Saved";
    }
}
