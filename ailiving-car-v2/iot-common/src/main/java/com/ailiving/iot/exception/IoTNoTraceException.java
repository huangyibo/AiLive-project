package com.ailiving.iot.exception;

import com.ailiving.iot.common.IoTCode;

public class IoTNoTraceException extends IoTException {

    public IoTNoTraceException(Integer code, String message) {
        super(code, message);
    }

    public IoTNoTraceException(IoTCode ioTCode) {
        super(ioTCode);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
