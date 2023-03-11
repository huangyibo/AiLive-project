package com.ailiving.iot.servicehub.domain;

import java.io.Serializable;

public class CarInfo implements Serializable {

    private static final long serialVersionUID = 5416096623903900134L;

    private Long id;
    private Long gmtCreate;
    private Long gmtModified;
    private String plateNumber;
    private String serialNumber;
    private String deviceId;
    private String imagePath;
    private String gearBoxType;
    private String oilCardNumber;
    private Long oilCardDate;
    private String brand;
    private String carModelId;
    private String industryId;
    private String carUse;
    private Float fuelTankage;
    private String chassisNumber;
    private Float calibrationTon;
    private String calibrationBase;
    private String engineType;
    private Float displacement;
    private String emissions;
    private String oilType;
    private Long productTime;
    private Integer isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getGearBoxType() {
        return gearBoxType;
    }

    public void setGearBoxType(String gearBoxType) {
        this.gearBoxType = gearBoxType;
    }

    public String getOilCardNumber() {
        return oilCardNumber;
    }

    public void setOilCardNumber(String oilCardNumber) {
        this.oilCardNumber = oilCardNumber;
    }

    public Long getOilCardDate() {
        return oilCardDate;
    }

    public void setOilCardDate(Long oilCardDate) {
        this.oilCardDate = oilCardDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarModelId() {
        return carModelId;
    }

    public void setCarModelId(String carModelId) {
        this.carModelId = carModelId;
    }

    public String getIndustryId() {
        return industryId;
    }

    public void setIndustryId(String industryId) {
        this.industryId = industryId;
    }

    public String getCarUse() {
        return carUse;
    }

    public void setCarUse(String carUse) {
        this.carUse = carUse;
    }

    public Float getFuelTankage() {
        return fuelTankage;
    }

    public void setFuelTankage(Float fuelTankage) {
        this.fuelTankage = fuelTankage;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public Float getCalibrationTon() {
        return calibrationTon;
    }

    public void setCalibrationTon(Float calibrationTon) {
        this.calibrationTon = calibrationTon;
    }

    public String getCalibrationBase() {
        return calibrationBase;
    }

    public void setCalibrationBase(String calibrationBase) {
        this.calibrationBase = calibrationBase;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public Float getDisplacement() {
        return displacement;
    }

    public void setDisplacement(Float displacement) {
        this.displacement = displacement;
    }

    public String getEmissions() {
        return emissions;
    }

    public void setEmissions(String emissions) {
        this.emissions = emissions;
    }

    public String getOilType() {
        return oilType;
    }

    public void setOilType(String oilType) {
        this.oilType = oilType;
    }

    public Long getProductTime() {
        return productTime;
    }

    public void setProductTime(Long productTime) {
        this.productTime = productTime;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "id=" + id +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", plateNumber='" + plateNumber + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", gearBoxType='" + gearBoxType + '\'' +
                ", oilCardNumber='" + oilCardNumber + '\'' +
                ", oilCardDate=" + oilCardDate +
                ", brand='" + brand + '\'' +
                ", carModelId='" + carModelId + '\'' +
                ", industryId='" + industryId + '\'' +
                ", carUse='" + carUse + '\'' +
                ", fuelTankage=" + fuelTankage +
                ", chassisNumber='" + chassisNumber + '\'' +
                ", calibrationTon=" + calibrationTon +
                ", calibrationBase='" + calibrationBase + '\'' +
                ", engineType='" + engineType + '\'' +
                ", displacement=" + displacement +
                ", emissions='" + emissions + '\'' +
                ", oilType='" + oilType + '\'' +
                ", productTime=" + productTime +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
