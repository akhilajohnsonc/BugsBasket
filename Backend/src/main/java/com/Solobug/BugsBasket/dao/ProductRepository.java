package com.Solobug.BugsBasket.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Solobug.BugsBasket.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
