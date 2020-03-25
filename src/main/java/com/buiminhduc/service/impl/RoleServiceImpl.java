package com.buiminhduc.service.impl;

import com.buiminhduc.autowire.BeanFactory;
import com.buiminhduc.common.annotation.Service;
import com.buiminhduc.exception.ObjectNotFoundException;
import com.buiminhduc.model.entity.Role;
import com.buiminhduc.model.response.RoleResponse;
import com.buiminhduc.repository.RoleRepository;
import com.buiminhduc.service.RoleService;
import com.buiminhduc.util.ObjectUtil;

import java.util.List;


@Service
public class RoleServiceImpl implements RoleService {
    private RoleRepository roleRepository;
    public RoleServiceImpl(){
        roleRepository = (RoleRepository) BeanFactory.getBeans().get("roleRepository");
    }
    @Override
    public RoleResponse findById(int id)  {
        Role role = roleRepository.findById(id);

        if(role==null)
            try {
                throw new ObjectNotFoundException();
            } catch (ObjectNotFoundException e) {
                e.printStackTrace();
            }

        RoleResponse roleResponse = new RoleResponse();

        ObjectUtil.copyProperties(role,roleResponse);

        return roleResponse;
    }

    @Override
    public List<RoleResponse> findAll() {
        return null;
    }
}
