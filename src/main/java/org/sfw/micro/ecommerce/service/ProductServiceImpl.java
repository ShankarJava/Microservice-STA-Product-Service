package org.sfw.micro.ecommerce.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.sfw.micro.ecommerce.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public List<Product> findAll() {
		return showProductList();
	}

	@Override
	public List<Product> findByCategory(String category) {
		return showProductList().stream().filter(product -> product.getCategory().equals(category))
				.collect(Collectors.toList());
	}

	@Override
	public Product findByID(int id) {
		return showProductList().stream().filter(product -> product.getProductID() == id).findAny().get();
	}

	private List<Product> showProductList() {
		return Arrays.asList(new Product(1, "Vivo Book", "Asus", "Laptops", 20000L),
				new Product(2, "Ideapad s340", "Lenovo", "Laptops", 320000L),
				new Product(3, "Galaxy M01", "Samsung", "Mobiles", 220000L),
				new Product(4, "K6 Note", "Lenovo", "Mobiles", 220000L),
				new Product(5, "HD Smart TV", "Samsung", "TV", 650000L),
				new Product(6, "Thinkpad T430", "Sony", "TV", 720000L),
				new Product(7, "Dell Inspiron", "Dell", "Laptops", 20000L),
				new Product(8, "Ultra HD Smart", "Sony", "TV", 890000L));
	}

}
