package com.example.BookStore.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.BookStore.Exception.OrderNotFoundException;
import com.example.BookStore.model.Order;
import com.example.BookStore.service.OrderServiceImpl;

@RestController
public class OrderController {
	
	@Autowired OrderServiceImpl orderService;
	
	
	
	
	@RequestMapping(value="getOrders")
	public ModelAndView getAllOrders(@RequestParam(name="customerId") long customerId){
		
		ModelAndView mav = new ModelAndView("viewName");
		List<Order> orderList = orderService.getAllOrders(customerId,"ordered");
		mav.addObject("orderList", orderList);
		return mav;
		
	} 
	
	@RequestMapping(value="deleteOrder")
	public ModelAndView deleteOrder(@RequestParam(name="orderId") long orderId){
		ModelAndView mav = new ModelAndView("viewName");
		orderService.deleteOrder(orderId,"ordered");
		return mav;
	}
	
	@ExceptionHandler
	public String orderNotFoundExceptionHandler(OrderNotFoundException exc){
		
		return exc.getMessage();
		
	}

}
