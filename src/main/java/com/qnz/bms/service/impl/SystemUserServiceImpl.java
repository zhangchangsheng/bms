package com.qnz.bms.service.impl;


import com.qnz.bms.domain.SystemUser;
import com.qnz.bms.domain.SystemUserExample;
import com.qnz.bms.mapper.SystemUserMapper;
import com.qnz.bms.service.SystemUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SystemUserServiceImpl implements SystemUserService{

    @Resource
    private SystemUserMapper mapper;

    @Override
    public SystemUser findByUserId(int userId) {
        return mapper.selectByPrimaryKey(userId);
    }

    @Override
    public SystemUser findByUsername(String username) {
        SystemUserExample selectByExample = new SystemUserExample();
        selectByExample.setDistinct(true);
        SystemUserExample.Criteria criteria= selectByExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andDeletedEqualTo(0);
        List<SystemUser> list =  mapper.selectByExample(selectByExample);
        if(list!=null && list.size()>0){
            return list.get(0);
        }
        return null;
    }
}
