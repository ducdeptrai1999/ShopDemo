package com.buiminhduc.repository.impl;

import com.buiminhduc.model.entity.WishListEntity;
import com.buiminhduc.repository.WishlistRepository;

import java.sql.SQLException;
import java.util.List;

public class WhistlistRepositoryImpl extends BasicQuery<WishListEntity, Integer> implements WishlistRepository {
    @Override
    public <S extends WishListEntity> List<S> findAll(){
        return super.findAll();
    }
    @Override
    public boolean kiemTraSanPhamCoTrongGioHangChua(int maSanPham){
        WishlistRepository wishlistRepository = new WhistlistRepositoryImpl();
        List<WishListEntity>  entities = wishlistRepository.findAll();
        for (WishListEntity wishListEntity : entities) {
            if (wishListEntity.getId() == maSanPham){
                return true;
            }
        }
        return false;
    }
}
