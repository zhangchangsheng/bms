package com.qnz.bms.controller;

import com.qnz.bms.domain.SystemUser;
import com.qnz.bms.service.SystemUserService;
import com.qnz.common.utils.IPUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private SystemUserService userService;

    @RequestMapping("/index")
    public String index(){
        logger.info(IPUtils.ipToLong("127.0.0.1")+"");
        return "hello world";
    }

    @RequestMapping("/getUserById")
    public SystemUser getUserById(@RequestParam int userId){
        SystemUser user = userService.findByUserId(userId);
        return user;
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
        Subject currentUser = SecurityUtils.getSubject();
        if (!currentUser.isAuthenticated()) {
            UsernamePasswordToken upToken = new UsernamePasswordToken(username, password);
            upToken.setRememberMe(false);
            try {
                currentUser.login(upToken);
                return "user/index";
            } catch (IncorrectCredentialsException ice) {
                System.out.println("邮箱/密码不匹配！");
            } catch (LockedAccountException lae) {
                System.out.println("账户已被冻结！");
            } catch (AuthenticationException ae) {
                System.out.println(ae.getMessage());
            }
        }
        return "redirect:/login.jsp";
    }
}
