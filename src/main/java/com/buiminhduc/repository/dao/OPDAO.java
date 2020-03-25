package com.buiminhduc.repository.dao;

import com.buiminhduc.model.entity.ProductEntity;

import java.util.ArrayList;
import java.util.Set;

public interface OPDAO {
    public ArrayList<ProductEntity> getDanhSach();
    public Set<String> getDanhSachTheoTenSP();
}
