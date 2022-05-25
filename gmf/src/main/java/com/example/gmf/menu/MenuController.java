package com.example.gmf.menu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gmf.menu.entity.MenuOrderMstr;
import com.example.gmf.menu.service.MenuService;

@RestController
@RequestMapping(value = "/gmf")
public class MenuController {

	@Autowired
	private MenuService menuService;

/*
	@PostMapping("/menu")
	public ResponseEntity<MenuOrderMstr> addOrder() {
		return menuService.save();
	}
*/
	@GetMapping("/test")
	public ResponseEntity<List<MenuOrderMstr>> search() {
		return menuService.select();
	}
	
}
