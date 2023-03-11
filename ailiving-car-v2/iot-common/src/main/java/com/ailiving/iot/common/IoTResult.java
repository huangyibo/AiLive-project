package com.ailiving.iot.common;

public class IoTResult<T> {

    public Integer code;

    public String message;

    public T data;

    public IoTResult() {
        code = IoTCodes.SUCCESS.getCode();
        message = IoTCodes.SUCCESS.getMessage();
    }

    public IoTResult(T data) {
        code = IoTCodes.SUCCESS.getCode();
        message = IoTCodes.SUCCESS.getMessage();
        this.data = data;
    }

    public IoTResult(IoTCode ioTCode) {
        code = ioTCode.getCode();
        message = ioTCode.getMessage();
    }

    public IoTResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public IoTResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Boolean hasSucceed() {
        if (IoTCodes.SUCCESS.getCode().equals(this.code)) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }
}
