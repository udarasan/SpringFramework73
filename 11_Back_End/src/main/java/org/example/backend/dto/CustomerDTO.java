package org.example.backend.dto;

public class CustomerDTO {
    private String cId;
    private String cName;
    private String cAddress;

    public CustomerDTO(String cId, String cName, String cAddress) {
        this.cId = cId;
        this.cName = cName;
        this.cAddress = cAddress;
    }

    public CustomerDTO() {
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }
}
