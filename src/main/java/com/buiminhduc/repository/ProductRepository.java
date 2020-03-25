package com.buiminhduc.repository;

import com.buiminhduc.model.entity.ProductEntity;

import java.util.List;


public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
    List<ProductEntity> findAll();
    ProductEntity findById(Integer id);
}
