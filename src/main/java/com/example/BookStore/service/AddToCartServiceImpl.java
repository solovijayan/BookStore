package com.example.BookStore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.BookStore.model.Cart;
import com.example.BookStore.model.Inventory;
import com.example.BookStore.repository.AddToCartRepository;
import com.example.BookStore.repository.InventoryRepository;

@Service
@Transactional
public class AddToCartServiceImpl implements AddToCartService {
@Autowired AddToCartRepository addToCartRepository;
@Autowired InventoryRepository invRepo;

@Override
public List<Cart> getAllOrders(long customerId) {

	List<Cart> cartList = addToCartRepository.findByCustomerId(customerId);
	if(cartList.size() < 0){
//		throw new OrderNotFoundException("No Orders found for Current Customer");
	}
	
	return cartList;

}

@Override
public Optional<Inventory> getBookData(int bookId) {
	return invRepo.findById(bookId);
}

@Override
public void saveCartData(Cart cart) {
	addToCartRepository.save(cart);
	
}


}
