package com.ailiving.iot.servicehub.service;

import com.ailiving.iot.common.IoTResult;
import com.ailiving.iot.servicehub.ServicehubApplicationTests;
import com.ailiving.iot.servicehub.api.CarInfoService;
import com.ailiving.iot.servicehub.domain.CarInfoDTO;
import org.junit.Test;

import javax.annotation.Resource;

public class CarInfoServiceTest extends ServicehubApplicationTests {

    @Resource
    private CarInfoService carInfoService;

    @Test
    public void queryCarByPlateNumberTest() {
        String plateNumber = "178236578123";
        IoTResult<CarInfoDTO> carInfoDTO =
                carInfoService.queryCarByPlateNumber(plateNumber);
    }
}
