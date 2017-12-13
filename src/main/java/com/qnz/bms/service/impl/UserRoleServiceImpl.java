package com.qnz.bms.service.impl;

import com.qnz.bms.domain.UserRole;
import com.qnz.bms.mapper.UserRoleMapper;
import com.qnz.bms.service.UserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Resource
    private UserRoleMapper mapper;

    @Override
    public UserRole findById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }
}
