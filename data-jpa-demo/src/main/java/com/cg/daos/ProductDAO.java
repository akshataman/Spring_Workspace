package com.cg.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.Product;

@Repository
public interface ProductDAO  extends JpaRepository<Product, Integer>{
   
}

//import java.util.List;
//
//import com.cg.entities.Product;
//
//public interface ProductDAO {
//	public void save(Product p);
//    public Product findById(Integer productId);
//    public List<Product> findAll();
//}
