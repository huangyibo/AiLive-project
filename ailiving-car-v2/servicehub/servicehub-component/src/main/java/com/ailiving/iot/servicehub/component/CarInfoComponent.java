package com.ailiving.iot.servicehub.component;

import com.ailiving.iot.servicehub.domain.CarInfoDTO;

public interface CarInfoComponent {

    Integer addCarInfo(CarInfoDTO carInfoDTO);

    CarInfoDTO queryByPlateNumber(String plateNumber);
}
