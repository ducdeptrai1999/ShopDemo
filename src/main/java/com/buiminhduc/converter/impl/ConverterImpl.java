package com.buiminhduc.converter.impl;

import com.buiminhduc.converter.Converter;
import com.buiminhduc.converter.ConverterObject;
import com.buiminhduc.model.entity.UserEntity;
import com.buiminhduc.model.request.UserRequest;
import com.buiminhduc.util.ObjectUtil;

import java.lang.reflect.InvocationTargetException;

// request , respond, entity
public class ConverterImpl<U,V,T> implements Converter<U,V,T> {
    @Override
    public T converToEntity(U u) {
        T t = null;
            ObjectUtil.copyProperties(u, t);

        return t;
    }


    @Override
    public V converToRespond(T t) {
        return null;
    }
}
