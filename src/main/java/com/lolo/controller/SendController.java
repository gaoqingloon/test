package com.lolo.controller;

import com.lolo.dao.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: gordon  Email:gordon_ml@163.com
 * @Date: 3/22/2020
 * @Description:
 * @version: 1.0
 */
@RestController
//@RequestMapping("/kafka")
public class SendController {

    @Autowired
    private Producer producer;

    @RequestMapping(value = "/kafka/send")
    public String send() {
        producer.send();
        return "{\"code\":0}";
    }
}