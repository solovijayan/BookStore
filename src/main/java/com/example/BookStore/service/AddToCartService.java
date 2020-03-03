package com.example.BookStore.service;

import java.util.List;
import java.util.Optional;

import com.example.BookStore.model.Cart;
import com.example.BookStore.model.Inventory;

public interface AddToCartService {

	List<Cart> getAllOrders(long customerId);


	Optional<Inventory> getBookData(int bookId);


	void saveCartData(Cart cart);

}
