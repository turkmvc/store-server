package com.budofa.store.controler.model;

public class FirmDTO extends BaseDTO {

    private String name;

    private FirmTypeDTO firmType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FirmTypeDTO getFirmType() {
        return firmType;
    }

    public void setFirmType(FirmTypeDTO firmType) {
        this.firmType = firmType;
    }
}
