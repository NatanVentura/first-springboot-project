package com.natan.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natan.demo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
