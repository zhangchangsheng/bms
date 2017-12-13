package com.qnz.bms.service.impl;

import com.qnz.bms.domain.Purview;
import com.qnz.bms.mapper.PurviewMapper;
import com.qnz.bms.service.PurviewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PurviewServiceImpl implements PurviewService {

    @Resource
    private PurviewMapper mapper;

    @Override
    public List<Purview> findByRoleId(Integer roleId) {
        return mapper.selectByRoleId(roleId);
    }

    @Override
    public Purview findById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }
}
