package com.ailiving.iot.servicehub.component.impl;

import com.ailiving.iot.common.IoTCodes;
import com.ailiving.iot.common.ServiceSupport;
import com.ailiving.iot.exception.IoTException;
import com.ailiving.iot.servicehub.component.CarInfoComponent;
import com.ailiving.iot.servicehub.domain.CarInfo;
import com.ailiving.iot.servicehub.domain.CarInfoDTO;
import com.ailiving.iot.servicehub.mapper.CarInfoDAO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;

@Component
public class CarInfoComponentImpl extends ServiceSupport implements CarInfoComponent {

    @Resource
    private CarInfoDAO carInfoDAO;

    @Override
    public Integer addCarInfo(CarInfoDTO carInfoDTO) {
        try {
            CarInfo carInfo = new CarInfo();
            BeanUtils.copyProperties(carInfoDTO, carInfo);
            return carInfoDAO.add(carInfo);
        } catch (Throwable e) {
            // log
            throw new IoTException(IoTCodes.SYSTEM_ERROR, e);
        }
    }

    @Override
    public CarInfoDTO queryByPlateNumber(String plateNumber) {
        try {
            CarInfo carInfo = carInfoDAO.queryByPlateNumber(plateNumber);
            CarInfoDTO carInfoDTO = null;
            if (!ObjectUtils.isEmpty(carInfo)) {
                carInfoDTO = new CarInfoDTO();
                BeanUtils.copyProperties(carInfo, carInfoDTO);
            }
            return carInfoDTO;
        } catch (Throwable e) {
            // log
            throw new IoTException(IoTCodes.SYSTEM_ERROR, e);
        }
    }
}
