package com.ailiving.iot.common;

import com.ailiving.iot.exception.IoTNoTraceException;

public class ServiceSupport {

    public ServiceSupport notBlank(String paramName, String value) {
        if (isBlank(value)) {
            throw new IoTNoTraceException(IoTCodes.PARAM_ERROR.getCode(), paramName + "cannot be blank");
        }
        return this;
    }

    public ServiceSupport notNull(String paramName, Object value) {
        if (null == value) {
            throw new IoTNoTraceException(IoTCodes.PARAM_ERROR.getCode(), paramName + "cannot be null");
        }
        return this;
    }

    private static boolean isBlank(CharSequence cs) {
        int strLen;
        if (cs != null && (strLen = cs.length()) != 0) {
            for(int i = 0; i < strLen; ++i) {
                if (!Character.isWhitespace(cs.charAt(i))) {
                    return false;
                }
            }

            return true;
        } else {
            return true;
        }
    }
}
