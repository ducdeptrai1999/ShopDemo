package com.buiminhduc.service.impl;

import com.buiminhduc.autowire.BeanFactory;
import com.buiminhduc.common.annotation.Service;
import com.buiminhduc.converter.ConverterObject;
import com.buiminhduc.converter.UserConverter;
import com.buiminhduc.model.entity.ProductEntity;
import com.buiminhduc.model.entity.UserEntity;
import com.buiminhduc.model.request.ProductRequest;
import com.buiminhduc.model.request.UserRequest;
import com.buiminhduc.repository.UserRepository;
import com.buiminhduc.repository.impl.ProductRepositoryImpl;
import com.buiminhduc.repository.impl.UserRepositoryImpl;
import com.buiminhduc.service.ProductService;

import java.sql.SQLException;

@Service
public class ProductServiceImpl implements ProductService {
    private UserRepository userRepository;

    public ProductServiceImpl() {
        userRepository = (UserRepository) BeanFactory.getBeans().get("userRepository");
    }
    @Override
    public void insert(ProductRequest request) {
        ProductEntity entity = UserConverter.converToEntity(request);
        //new ConverterObject()
        try {
            new ProductRepositoryImpl().insert(entity);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(ProductRequest request, int id) {

    }
}
