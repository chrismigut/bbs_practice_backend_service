package binarybyte.services.practice_backend_service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import binarybyte.services.practice_backend_service.models.Product;
import binarybyte.services.practice_backend_service.repository.ProductDaoImpl;

@Service
public class ProductService {

	@Autowired
	private ProductDaoImpl productRepository;
	
	public List<Product> findAllProducts(){
		return productRepository.findAll();
	}
}
