package com.briup.apps.ej.config;

/**
 * @program: app01
 * @description: 自定义异常
 * @author: charles
 * @create: 2019-03-13 21:02
 **/

public class CustomerException extends RuntimeException {
    /**
     * 状态码
     */
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public CustomerException(Integer code, String message){
        super(message);
        this.code = code;
    }
}
