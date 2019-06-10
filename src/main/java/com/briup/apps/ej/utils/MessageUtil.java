package com.briup.apps.ej.utils;

import java.util.Date;

public class MessageUtil {



    public static Message error(String msg){
        Message message=new Message();
        message.setStatus(500);
        message.setMessage(msg);
        message.setTimetamp(new Date().getTime());
        return message;
    }
    public static Message success(String msg){//增删改结果返回
        Message message=new Message();
        message.setStatus(200);
        message.setMessage(msg);
        message.setTimetamp(new Date().getTime());
        return message;

    }
    public static Message success(String msg,Object data){//查询操作结果返回
        Message message=new Message();
        message.setMessage(msg);
        message.setStatus(200);
        message.setData(data);
        message.setTimetamp(new Date().getTime());
        return message;

    }



}
