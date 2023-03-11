package com.ailiving.iot.exception;

import com.ailiving.iot.common.IoTCode;
import com.ailiving.iot.common.IoTCodes;

public class IoTException extends RuntimeException {

    private Integer code;

    private String message;

    public IoTException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public IoTException(Integer code, String message, Throwable cause) {
        super(cause);
        this.code = code;
        this.message = message;
    }

    public IoTException(IoTCode ioTCode) {
        this.code = ioTCode.getCode();
        this.message = ioTCode.getMessage();
    }

    public IoTException(IoTCode ioTCode, Throwable cause) {
        super(cause);
        if (ioTCode == null) {
            throw new IoTException(IoTCodes.SYSTEM_ERROR);
        }
        this.code = ioTCode.getCode();
        this.message = ioTCode.getMessage();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
