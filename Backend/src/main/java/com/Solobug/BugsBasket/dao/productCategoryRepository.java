package com.Solobug.BugsBasket.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.Solobug.BugsBasket.entity.ProductCategory;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface productCategoryRepository extends JpaRepository<ProductCategory, Long> {

}
