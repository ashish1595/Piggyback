package com.incentives.piggyback.sampleApp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.incentives.piggyback.sampleApp.models.Product;

@Service 
public class ProductService {

	public List<Product> getAllProducts() {
		
		List<Product> listOfProducts = new ArrayList<>();
		listOfProducts.add(new Product("123", "Strawberry Shake", "This is super healthy ", 400, "Mc Donald"));
		listOfProducts.add(new Product("124", "Chocolate Shake", "This is awesome shake ", 300, "Mc Donald"));
		listOfProducts.add(new Product("125", "Apple Pie", "This is Fresh ", 200, "Food Panda"));

		return listOfProducts;
	}

	public Product getProductById(String id) {

		Predicate<Product> byId = p -> p.getId().equals(id);
		return filterProducts(byId);
	}

	public Product filterProducts(Predicate<Product> strategy) {
		return getAllProducts().stream().filter(strategy).findFirst().orElse(null);
	}

}
