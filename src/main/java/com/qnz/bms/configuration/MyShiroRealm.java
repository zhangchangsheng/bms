package com.qnz.bms.configuration;

import com.qnz.bms.domain.Purview;
import com.qnz.bms.domain.SystemUser;
import com.qnz.bms.domain.UserRole;
import com.qnz.bms.service.PurviewService;
import com.qnz.bms.service.SystemUserService;
import com.qnz.bms.service.UserRoleService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MyShiroRealm extends AuthorizingRealm {
    private static final Logger logger = LoggerFactory.getLogger(MyShiroRealm.class);

    @Resource
    private SystemUserService systemUserService;
    @Resource
    private PurviewService purviewService;
    @Resource
    private UserRoleService userRoleService;

    /**
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        logger.info("权限配置-->MyShiroRealm.doGetAuthorizationInfo()");
        String username = (String) getAvailablePrincipal(principalCollection);
        //通过用户名去获得用户的所有资源，并把资源存入info中
        Set<String> userRoles = new LinkedHashSet<>();
        Set<String> userPermissions = new LinkedHashSet<>();
        SystemUser user = systemUserService.findByUsername(username);
        if (user != null && user.getRoleId() != null) {
            UserRole userRole = userRoleService.findById(user.getRoleId());
            userRoles.add(userRole.getCode());
            List<Purview> list = purviewService.findByRoleId(user.getRoleId());
            if (list != null) {
                for (Purview purview : list) {
                    userPermissions.add(purview.getCode());
                }
            }
        } else {
            throw new AuthenticationException();
        }
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.setRoles(userRoles);
        authorizationInfo.setStringPermissions(userPermissions);
        return authorizationInfo;
    }

    /**
     * 主要是用来进行身份认证的，也就是说验证用户输入的账号和密码是否正确。
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        logger.info("MyShiroRealm.doGetAuthenticationInfo()");
        UsernamePasswordToken upToken = (UsernamePasswordToken) authenticationToken;
        // 获取用户输入的账号
        String username = upToken.getUsername();
        // 通过 username 从数据库中查找 SystemUser对象，如果找到，没找到.
        // 实际项目中，这里可以根据实际情况做缓存，如果不做，Shiro自己也是有时间间隔机制，2分钟内不会重复执行该方法
        SystemUser user = systemUserService.findByUsername(username);
        if (user == null) {
            logger.info("----->>username[" + username + "]不存在");
            // 抛出 帐号找不到异常
            throw new UnknownAccountException();
        }
        if (user.getIslock() != 0) {
            // 抛出 帐号锁定异常
            throw new LockedAccountException();
        }
//        ByteSource credentialsSalt = ByteSource.Util.bytes(username);
        // 验证密码
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(username, user.getPassword().toCharArray(), getName());
        return authenticationInfo;
    }
}
