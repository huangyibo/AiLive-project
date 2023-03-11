package com.ailiving.iot.common;

public class IoTCodes {

    public static IoTCode SUCCESS = new IoTCode(200, "success");
    public static IoTCode REQUEST_ERROR = new IoTCode(400, "request error");
    public static IoTCode PARAM_ERROR = new IoTCode(460, "param error");
    public static IoTCode SYSTEM_ERROR = new IoTCode(500, "system error");
}
