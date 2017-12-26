package com.qnz.bms.controller;

import com.qnz.common.utils.IPUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        logger.info(IPUtils.ipToLong("127.0.0.1")+"");

        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        String hashAlgorithmName = "MD5";
        String credentials = "12345678";
        Object obj = new SimpleHash(hashAlgorithmName, credentials,null,2);
        logger.info(obj.toString());
        return "login";
    }

    @RequestMapping(value = "/auth", method = RequestMethod.POST)
    public String auth(@RequestParam("username") String username, @RequestParam("password") String password) {
        Subject currentUser = SecurityUtils.getSubject();
        if (!currentUser.isAuthenticated()) {
            UsernamePasswordToken upToken = new UsernamePasswordToken(username, password);
            upToken.setRememberMe(false);
            try {
                currentUser.login(upToken);
                return "redirect:/index";
            } catch (IncorrectCredentialsException ice) {
                logger.info("账号/密码不匹配！");
            } catch (LockedAccountException lae) {
                logger.info("账户已被冻结！");
            } catch (ExcessiveAttemptsException eae){
                logger.info("账户密码错误超过5次！");
            }catch (AuthenticationException ae) {
                logger.info(ae.getMessage());
            }
        }
        return "redirect:/login";
    }
}
