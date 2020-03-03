package com.example.BookStore.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.BookStore.service.InventoryServiceImpl;
import com.example.BookStore.model.Inventory;



@RestController
public class InventoryContoller {
	
	@Autowired
	private InventoryServiceImpl inventoryserv;
	
	@GetMapping("/inventoryview")
	public ModelAndView register(Model model)
	{
		model.addAttribute("inventory",new Inventory());
		return new ModelAndView("inventory");
			}
	@PostMapping("/inventorysave")
	public ModelAndView register(@ModelAttribute("inventory") Inventory inventory,Model model)
	{
		//m.addAttribute("user",new User());
		//userService.addUser(user);
		inventoryserv.inventorysave(inventory);
		return new ModelAndView("welcome");
			}
	@RequestMapping("/")
	public ModelAndView inventoryList(Map<String,Object> map,Model model){
		
		map.put("inventorylist", new Inventory());
		List<Inventory> inven=inventoryserv.getinventoryList();
		model.addAttribute("inventorylist",inven);
		return new ModelAndView("homepage");
	}

}
