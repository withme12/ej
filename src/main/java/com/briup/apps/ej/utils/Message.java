package com.briup.apps.ej.utils;

public class Message {
    private Integer status;
    private String Message;
    private Object data;
    private Long timetamp;
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Long getTimetamp() {
        return timetamp;
    }

    public void setTimetamp(Long timetamp) {
        this.timetamp = timetamp;
    }



}
