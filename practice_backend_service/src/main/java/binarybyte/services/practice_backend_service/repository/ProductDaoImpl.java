package binarybyte.services.practice_backend_service.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import binarybyte.services.practice_backend_service.models.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Override
	public List<Product> findAll() {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "Product"));
		products.add(new Product(2, "xbox"));
		return products;
	}

}
