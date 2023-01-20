package org.sfw.micro.ecommerce.controller;

import java.util.List;

import org.sfw.micro.ecommerce.model.Product;
import org.sfw.micro.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product-service")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/get-allthe-products-available")
	public List<Product> getAllTheProducts() {

		return productService.findAll();
	}

	@GetMapping("product-by-id/{productID}")
	public Product getProduct(@PathVariable("productID") int id) {
		return productService.findByID(id);
	}
 
	@GetMapping("/products-by-category/{category}")
	public List<Product> getAllTheProducts(@PathVariable("category") String category) {

		return productService.findByCategory(category);
	}

}
