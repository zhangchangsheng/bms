package com.qnz.bms.service;

import com.qnz.bms.domain.Purview;

import java.util.List;

public interface PurviewService {

    List<Purview> findByRoleId(Integer roleId);

    Purview findById(Integer id);

}
