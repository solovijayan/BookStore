package com.example.BookStore.service;

import java.util.List;

import com.example.BookStore.model.Order;

public interface OrderService {

	List<Order> getAllOrders(long customerId,String status);

	void deleteOrder(long orderId,String status);

}
