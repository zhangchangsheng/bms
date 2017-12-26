package com.qnz.bms.controller;

import com.alibaba.fastjson.JSON;
import com.qnz.bms.domain.SystemUser;
import com.qnz.bms.service.SystemUserService;
import com.qnz.common.utils.IPUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @Autowired
    private SystemUserService service;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(Model model){
        String ipString = "127.0.0.1";
        long ipLong = IPUtils.ipToLong(ipString);
        logger.info(ipString);
        model.addAttribute("ip",ipString);
        model.addAttribute("number",ipLong);
        List<SystemUser> list= service.find(null,null,null);
        logger.info(JSON.toJSONString(list));
        return "hello";
    }

}
