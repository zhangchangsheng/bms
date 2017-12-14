package com.qnz.bms.controller;

import com.qnz.common.utils.IPUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(Model model){
        String ipString = "127.0.0.1";
        long ipLong = IPUtils.ipToLong(ipString);
        logger.info(ipString);
        model.addAttribute("ip",ipString);
        model.addAttribute("number",ipLong);
        return "hello";
    }

}
