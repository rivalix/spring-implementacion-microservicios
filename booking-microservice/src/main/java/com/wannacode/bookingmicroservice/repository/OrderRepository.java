package com.wannacode.bookingmicroservice.repository;

import com.wannacode.bookingmicroservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
