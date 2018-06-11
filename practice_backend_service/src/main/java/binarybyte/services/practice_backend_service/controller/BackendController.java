package binarybyte.services.practice_backend_service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import binarybyte.services.practice_backend_service.models.Product;

@RestController
public class BackendController {
	
	@GetMapping("/products")
	public List<Product> findAllProducts(){
		
		List<Product> products = new ArrayList<Product>();
		
		products.add(new Product(1, "Product"));
		products.add(new Product(2, "xbox"));
		
		return products;
		
	}

}
