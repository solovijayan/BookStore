package com.example.BookStore.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookStore.repository.InventoryRepository;
import com.example.BookStore.model.Inventory;

@Service
@Transactional
public class InventoryServiceImpl implements InventoryService {
	@Autowired
	private InventoryRepository inventoryRepo;
	public void inventorysave(Inventory inventory)
	{
		inventoryRepo.save(inventory);
	}
	public List<Inventory> getinventoryList()
	{
	List<Inventory> invenlist=(List<Inventory>) inventoryRepo.findAll();
			return invenlist;
		
		}
}
