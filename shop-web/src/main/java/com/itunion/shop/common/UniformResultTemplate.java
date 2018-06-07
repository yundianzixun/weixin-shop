package com.itunion.shop.common;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by lin on 17/7/14.
 */
public class UniformResultTemplate<T> {
    @ApiModelProperty(notes = "返回状态码")
    int code;
    @ApiModelProperty(notes = "返回信息")
    String message;
    @ApiModelProperty(notes = "返回对象")
    T result;
    public UniformResultTemplate(){

    }
    public UniformResultTemplate(int code, String message, T result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "UniformResultTemplate{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", result=" + result +
                '}';
    }
}
