package com.ailiving.iot.servicehub.api;

import com.ailiving.iot.common.IoTResult;
import com.ailiving.iot.servicehub.domain.CarInfoDTO;

public interface CarInfoService {

    /**
     * 创建车辆
     * @param
     *   carInfoDTO 车辆信息
     * @return {@linkplain Integer}
     *   SUCCESS - 大于 0, FAILED - 0
     */
    IoTResult<Void> createCar(CarInfoDTO carInfoDTO);

    /**
     * 通过车牌号查询车辆
     * @param
     *   plateNumber - 车牌号
     * @return {@linkplain CarInfoDTO}
     *   CarInfoDTO - 车辆信息
     */
    IoTResult<CarInfoDTO> queryCarByPlateNumber(String plateNumber);
}
