package com.buiminhduc.service;

import com.buiminhduc.exception.ObjectNotFoundException;
import com.buiminhduc.model.request.Auth;
import com.buiminhduc.model.request.UserRequest;
import com.buiminhduc.model.response.UserResponse;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public interface UserService {
    void insert(UserRequest request) throws SQLException;

    void update(UserRequest request, int id) throws SQLException;

    UserResponse findUserByUserNameAndPassWord(Auth auth);

    List<UserResponse> findAll();

    void delete (int id) throws NoSuchFieldException;

    UserResponse finById(Integer id);

    void deleteByIds(int[] ids);
}
