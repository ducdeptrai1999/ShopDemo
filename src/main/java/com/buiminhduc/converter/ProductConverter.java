package com.buiminhduc.converter;

import com.buiminhduc.model.entity.ProductEntity;
import com.buiminhduc.model.request.ProductRequest;
import com.buiminhduc.model.response.ProductResponse;

public class ProductConverter implements Converter<ProductRequest, ProductResponse, ProductEntity> {

    @Override
    public ProductEntity converToEntity(ProductRequest productRequest) {
        return null;
    }

    @Override
    public ProductResponse converToRespond(ProductEntity productEntity) {
        return null;
    }
}
