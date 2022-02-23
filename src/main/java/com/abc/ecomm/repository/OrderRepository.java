package com.abc.ecomm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.ecomm.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {

}