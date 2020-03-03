package com.example.BookStore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.BookStore.model.Cart;
import com.example.BookStore.model.Order;

public interface AddToCartRepository extends CrudRepository<Cart, Long> {
	@Query(value = "SELECT * FROM Cart WHERE CustomerId = ?1", nativeQuery = true)
	public List<Cart> findByCustomerId(long customerId);
}
