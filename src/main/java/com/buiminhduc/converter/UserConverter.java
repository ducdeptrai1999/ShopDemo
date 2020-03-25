package com.buiminhduc.converter;

import com.buiminhduc.model.entity.ProductEntity;
import com.buiminhduc.model.entity.UserEntity;
import com.buiminhduc.model.request.ProductRequest;
import com.buiminhduc.model.request.UserRequest;
import com.buiminhduc.model.response.UserResponse;
import com.buiminhduc.util.ObjectUtil;

import java.lang.reflect.InvocationTargetException;

public class UserConverter {
    public static UserEntity converToEntity(UserRequest userRequest){
        UserEntity userEntity = new UserEntity();

            ObjectUtil.copyProperties(userRequest, userEntity);

        return userEntity;
    }
    public static UserEntity converToEntity(UserRequest userRequest, int id){
        UserEntity userEntity = new UserEntity();
        userEntity.setId(id);

            ObjectUtil.copyProperties(userRequest, userEntity);

        return userEntity;
    }
    public static UserResponse converToRespond(UserEntity entity) {
        UserResponse respond = new UserResponse();

            ObjectUtil.copyProperties(entity, respond);

        return respond;
    }

    public static ProductEntity converToEntity(ProductRequest productRequest){
        ProductEntity productEntity = new ProductEntity();

            ObjectUtil.copyProperties(productRequest, productEntity);

        return productEntity;
    }
}
