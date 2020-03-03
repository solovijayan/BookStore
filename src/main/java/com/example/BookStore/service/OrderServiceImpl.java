package com.example.BookStore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.BookStore.Exception.OrderNotFoundException;
import com.example.BookStore.model.Order;
import com.example.BookStore.repository.OrderRepository;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
	
	@Autowired OrderRepository orderRepository;

	@Override
	public List<Order> getAllOrders(long customerId,String status) {
		
		List<Order> orderList = orderRepository.findByCustomerId(customerId,status);
		if(orderList.size() < 0){
			throw new OrderNotFoundException("No Orders found for Current Customer");
		}
		
		return orderList;
	}

	@Override
	public void deleteOrder(long orderId,String status) {
		Optional<Order> order = orderRepository.findById(orderId,status);
		if(order.isPresent()){
			//add flow to add books count to book inventory
			orderRepository.deleteById(orderId);
		}else{
			
			throw new OrderNotFoundException("No Such Order found for Current Customer");
		}
		
	}

	

}
