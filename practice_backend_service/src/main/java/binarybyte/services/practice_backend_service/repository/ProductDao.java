package binarybyte.services.practice_backend_service.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import binarybyte.services.practice_backend_service.models.Product;

public interface ProductDao {
	List<Product> findAll();
}
