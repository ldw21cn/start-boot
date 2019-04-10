package com.htsc.boll.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author lvdawei
 * @Date 2019/4/10 21:10
 * @Version 1.0
 */
@Controller
@RequestMapping("boll")
public class BollController {

    @RequestMapping
    @ResponseBody
    public String bool() {
        return "bool";
    }

}
