package com.example.BookStore.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.BookStore.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
	@Query(value = "SELECT * FROM Orders WHERE CustomerId = ?1 and status = ?2", nativeQuery = true)
	public List<Order> findByCustomerId(long customerId,String status);

	@Query(value = "SELECT * FROM Orders WHERE OrderId = ?1 and status = ?2", nativeQuery = true)
	public Optional<Order> findById(long orderId, String status);

}
