package com.abc.ecomm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.abc.ecomm.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {	
	
	
	public Product findByProductName(String productName);
	
	@Query("Select p from Product p where p.productCategory = :pcategory")
	public List<Product> findProductByCategory(@Param("pcategory") String category);
	
	
	
}
