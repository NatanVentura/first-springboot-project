package com.natan.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natan.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
