package com.buiminhduc.converter;

import com.buiminhduc.converter.impl.ConverterImpl;
import com.buiminhduc.model.entity.UserEntity;
import com.buiminhduc.model.request.UserRequest;
import com.buiminhduc.util.ObjectUtil;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ConverterObject<T> {
    public ConverterObject() {
    }

    public T converToEntity(Object objectRequest){
        T obj = null;
            ObjectUtil.copyProperties(objectRequest, obj);
        return obj;
    }


    public static void main(String[] args) {
        Converter converter = new ConverterImpl();
        UserRequest userRequest = new UserRequest("Duc","123456","123456798","ducminh1999",1);
        UserEntity userEntity = (UserEntity) converter.converToEntity(userRequest);
        System.out.println(userEntity.toString());
        Field[] fieldsDestination= userEntity.getClass().getDeclaredFields();
        fieldsDestination.toString();
    }
}
