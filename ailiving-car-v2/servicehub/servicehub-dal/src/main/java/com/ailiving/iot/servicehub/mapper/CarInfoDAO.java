package com.ailiving.iot.servicehub.mapper;

import com.ailiving.iot.servicehub.domain.CarInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarInfoDAO {

    Integer add(CarInfo carInfo);

    CarInfo queryByPlateNumber(@Param("plateNumber") String plateNumber);
}
