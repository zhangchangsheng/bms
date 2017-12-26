package com.qnz.bms.service;

import com.qnz.bms.domain.SystemUser;
import com.qnz.bms.domain.SystemUserExample;

import java.util.List;

public interface SystemUserService {

    SystemUser findByUserId(int userId);

    SystemUser findByUsername(String username);

    void loginSuccess(Integer userId);

    boolean loginFailAndLock(Integer userId);

    List<SystemUser> find(SystemUserExample example , Integer pageNum, Integer pageSize);
}
