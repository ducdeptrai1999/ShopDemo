package com.buiminhduc.converter;

public interface Converter<U,V,T> {
    T converToEntity(U u);
    V converToRespond(T t);
}
