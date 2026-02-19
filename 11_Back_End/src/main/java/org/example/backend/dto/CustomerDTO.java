package org.example.backend.dto;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class CustomerDTO {
    @Nullable
    private int cId;
    @NotBlank(message = "Customer name is mandatory")
    @Pattern(regexp = "",message = "")
    private String cName;
    @NotBlank(message = "Customer adress is mandatory")
    @Size(min=10,message = "customer address should be at least 10 characters long")
    private String cAddress;

    public CustomerDTO(int cId, String cName, String cAddress) {
        this.cId = cId;
        this.cName = cName;
        this.cAddress = cAddress;
    }

    public CustomerDTO() {
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
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
