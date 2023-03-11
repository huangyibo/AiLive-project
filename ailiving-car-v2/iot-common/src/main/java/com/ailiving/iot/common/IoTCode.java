package com.ailiving.iot.common;

public class IoTCode {

    private Integer code;
    private String message;
    private String localized;

    public IoTCode() {}

    public IoTCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public IoTCode (Integer code, String message, String localized) {
        this.code = code;
        this.message = message;
        this.localized= localized;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
