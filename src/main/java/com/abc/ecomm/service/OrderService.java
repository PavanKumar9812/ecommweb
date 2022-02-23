package com.abc.ecomm.service;

import com.abc.ecomm.entity.Order;

public interface OrderService {

	public Order saveOrder(Order order);
	
	public Order getOrderDetails(int orderId);
	
	
}