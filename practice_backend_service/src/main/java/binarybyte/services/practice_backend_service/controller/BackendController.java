package binarybyte.services.practice_backend_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import binarybyte.services.practice_backend_service.models.Product;
import binarybyte.services.practice_backend_service.services.ProductService;

@RestController
public class BackendController {

	@Autowired
	private ProductService productService;

	@GetMapping("/products")
	public List<Product> findAllProducts() {
		return productService.findAllProducts();
	}
}
