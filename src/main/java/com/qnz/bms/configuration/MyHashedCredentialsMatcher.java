package com.qnz.bms.configuration;

import com.qnz.bms.domain.SystemUser;
import com.qnz.bms.service.SystemUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;


public class MyHashedCredentialsMatcher extends HashedCredentialsMatcher {

    private static final Logger logger = LoggerFactory.getLogger(MyHashedCredentialsMatcher.class);

    @Resource
    private SystemUserService systemUserService;

    @Override
    public boolean doCredentialsMatch(AuthenticationToken token,
                                      AuthenticationInfo info) {
        logger.info("登录验证");
        // 传入的用户名称
        String username = (String) token.getPrincipal();
        SystemUser user = systemUserService.findByUsername(username);
        if (user.getLoginFailTimes() > 5) { // 登录失败次数
            throw new ExcessiveAttemptsException();
        }
        boolean matches = super.doCredentialsMatch(token, info);
        if (matches) {
            logger.info("登录成功");
            systemUserService.loginSuccess(user.getUserId());
        } else {
            logger.info("登录失败");
            boolean isLock = systemUserService.loginFailAndLock(user.getUserId());
            if(isLock){
                logger.info("用户"+username+"登录次数超过5次,被锁定");
            }
            throw new IncorrectCredentialsException();
        }
        return matches;
    }
}
