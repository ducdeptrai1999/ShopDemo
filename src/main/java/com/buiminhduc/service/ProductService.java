package com.buiminhduc.service;

import com.buiminhduc.model.request.ProductRequest;
import com.buiminhduc.model.request.UserRequest;

import java.sql.SQLException;

public interface ProductService {
    void insert(ProductRequest request);

    void update(ProductRequest request, int id);
}
