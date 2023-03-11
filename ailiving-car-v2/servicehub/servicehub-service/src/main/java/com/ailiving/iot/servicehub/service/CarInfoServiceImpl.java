package com.ailiving.iot.servicehub.service;

import com.ailiving.iot.common.IoTCodes;
import com.ailiving.iot.common.IoTResult;
import com.ailiving.iot.common.ServiceSupport;
import com.ailiving.iot.servicehub.api.CarInfoService;
import com.ailiving.iot.servicehub.common.ServicehubCodes;
import com.ailiving.iot.servicehub.component.CarInfoComponent;
import com.ailiving.iot.servicehub.domain.CarInfoDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("carInfoService")
public class CarInfoServiceImpl extends ServiceSupport implements CarInfoService {

    @Resource
    private CarInfoComponent carInfoComponent;

    @Override
    public IoTResult<Void> createCar(CarInfoDTO carInfoDTO) {
        notNull("carInfoDTO", carInfoDTO)
                .notBlank("plateNumber", carInfoDTO.getPlateNumber())
                .notBlank("deviceId", carInfoDTO.getDeviceId());
        Integer count = carInfoComponent.addCarInfo(carInfoDTO);
        if (count > 0) {
            return new IoTResult<Void>(IoTCodes.SUCCESS);
        }
        return new IoTResult<Void>(ServicehubCodes.CREATE_CAR_FAILURE);
    }

    @Override
    public IoTResult<CarInfoDTO> queryCarByPlateNumber(String plateNumber) {
        notBlank("plateNumber", plateNumber);
        CarInfoDTO carInfo = carInfoComponent.queryByPlateNumber(plateNumber);
        return new IoTResult<CarInfoDTO>(carInfo);
    }
}
