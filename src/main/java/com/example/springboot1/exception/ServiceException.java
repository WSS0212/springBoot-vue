package com.example.springboot1.exception;

import lombok.Getter;

/**
 * 自定义异常
 *
 * @author wss
 * @create 2023-02-28-20:56
 */
@Getter
public class ServiceException extends RuntimeException {
    private String code;

    public ServiceException(String code, String msg) {
        super(msg);
        this.code = code;
    }
}
