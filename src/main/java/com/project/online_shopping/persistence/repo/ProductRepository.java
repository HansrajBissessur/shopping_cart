package com.project.online_shopping.persistence.repo;

import com.project.online_shopping.persistence.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findAll();
    List<Product> findByName(String name);
    List<Product> findByCategory(String category);
}
