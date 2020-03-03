package com.example.BookStore.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.BookStore.model.Cart;
import com.example.BookStore.model.Inventory;
import com.example.BookStore.service.AddToCartService;

@RestController
public class AddToCartController {
	
	@Autowired AddToCartService cartService;
	
	@RequestMapping(value="allCart")
	public ModelAndView getAllOrders(@RequestParam(name="customerId") long customerId){
		
		ModelAndView mav = new ModelAndView("viewName");
		List<Cart> cartList = cartService.getAllOrders(customerId);
		mav.addObject("cartList", cartList);
		return mav;
		
	} 
	
	@RequestMapping(value="saveCart")
	public ModelAndView saveCart(@RequestParam(name="bookId") int bookId,@RequestParam(name="qty") int qty,@RequestParam(name="name")String name){
		
		ModelAndView mav = new ModelAndView("cart");
		Optional<Inventory> book = cartService.getBookData(bookId);
		if(book.isPresent()){
			Cart cart = new Cart();
			cart.setBookId(book.get().getBookId());
			cart.setQuantity(qty);
			cart.setCustomerName(name);
			cartService.saveCartData(cart);
		}
		return mav;
		
	} 

}
