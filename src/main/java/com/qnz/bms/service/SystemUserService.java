package com.qnz.bms.service;

import com.qnz.bms.domain.SystemUser;

public interface SystemUserService {

    SystemUser findByUserId(int userId);

    SystemUser findByUsername(String username);

    void loginSuccess(Integer userId);

    boolean loginFailAndLock(Integer userId);
}
