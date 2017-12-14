package com.qnz.bms.service.impl;


import com.qnz.bms.domain.SystemUser;
import com.qnz.bms.domain.SystemUserExample;
import com.qnz.bms.mapper.SystemUserMapper;
import com.qnz.bms.service.SystemUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class SystemUserServiceImpl implements SystemUserService {
    private static final Logger logger = LoggerFactory.getLogger(SystemUserServiceImpl.class);
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
        SystemUserExample.Criteria criteria = selectByExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andDeletedEqualTo(0);
        List<SystemUser> list = mapper.selectByExample(selectByExample);
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    @Override
    @Transactional
    public void loginSuccess(Integer userId) {
        logger.info("登录成功");
        SystemUser user = new SystemUser();
        user.setUserId(userId);
        user.setLoginTime(new Date());
        user.setLoginFailTimes(0);
        user.setUpdateTime(new Date());
        mapper.updateByPrimaryKeySelective(user);
    }

    @Override
    @Transactional
    public boolean loginFailAndLock(Integer userId) {
        logger.info("登录失败");
        boolean isLock = false;
        SystemUser user = mapper.selectByPrimaryKey(userId);
        int times = user.getLoginFailTimes() == null ? 0 : user.getLoginFailTimes().intValue();
        times = times + 1;
        SystemUser record = new SystemUser();
        record.setUserId(userId);
        record.setLoginFailTimes(times);
        if (times >= 5) {
            isLock = true;
            record.setIslock(2); // 限时锁定
            record.setLockTime(new Date());
        }
        record.setUpdateTime(new Date());
        mapper.updateByPrimaryKeySelective(record);
        return isLock;
    }
}
