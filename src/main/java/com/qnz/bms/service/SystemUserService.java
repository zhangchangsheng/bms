package com.qnz.bms.service;

import com.qnz.bms.domain.SystemUser;

public interface SystemUserService {

    public SystemUser findByUserId(int userId);

    public SystemUser findByUsername(String username);
}
