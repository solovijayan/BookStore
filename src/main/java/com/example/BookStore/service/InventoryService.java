package com.example.BookStore.service;


import java.util.List;

import com.example.BookStore.model.Inventory;


public interface InventoryService {
	
	public void inventorysave(Inventory inventory);
	public List<Inventory> getinventoryList();

}
