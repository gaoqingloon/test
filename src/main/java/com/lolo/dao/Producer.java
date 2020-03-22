package com.lolo.dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lolo.bean.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;


/**
 * @Author: gordon  Email:gordon_ml@163.com
 * @Date: 3/22/2020
 * @Description:
 * @version: 1.0
 */
@Component
public class Producer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    private static Gson gson = new GsonBuilder().create();

    //发送消息方法
    public void send() {
        Message message = new Message();
        message.setId("KFK_" + System.currentTimeMillis());
        message.setMsg(UUID.randomUUID().toString());
        message.setSendTime(new Date());
        kafkaTemplate.send("test", gson.toJson(message));
    }
}
