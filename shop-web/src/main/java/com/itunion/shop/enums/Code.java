package com.itunion.shop.enums;

public enum Code {
    SUCCESS(100, " SUCCESS"),
    FAIL(101, "FAIL"),
    unknown(-1, "UNKNOWN"),
    UNAUTHORIZED(401, "Logon has expired"),
    INVALID_USERNAME_OR_PASSWORD(402, "用户名或密码错误"),
    ;

    private int code;
    private String desc;

    Code(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static Code fromCode(int code) {
        for (Code ec : Code.values()) {
            if (ec.getCode() == code) {
                return ec;
            }
        }
        return unknown;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
