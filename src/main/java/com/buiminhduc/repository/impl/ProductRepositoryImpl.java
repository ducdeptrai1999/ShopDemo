package com.buiminhduc.repository.impl;

import com.buiminhduc.model.entity.ProductEntity;
import com.buiminhduc.repository.ProductRepository;

import java.util.List;

public class ProductRepositoryImpl extends BasicQuery<ProductEntity, Integer> implements ProductRepository {
    @Override
    public List<ProductEntity> findAll()  {
        return super.findAll();
    }

    @Override
    public ProductEntity findById(Integer id) {
        return super.findById(id);
    }
}
