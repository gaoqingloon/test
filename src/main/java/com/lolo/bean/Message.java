package com.lolo.bean;

import java.util.Date;

/**
 * @Author: gordon  Email:gordon_ml@163.com
 * @Date: 3/22/2020
 * @Description:
 * @version: 1.0
 */
public class Message {

    private String id;
    private String msg;
    private Date sendTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }
}
