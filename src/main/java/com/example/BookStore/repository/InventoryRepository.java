package com.example.BookStore.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.BookStore.model.Inventory;
import org.springframework.stereotype.Repository;



@Repository
public interface InventoryRepository extends CrudRepository<Inventory, Integer>{

}
