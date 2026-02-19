package org.example.backend.service.custom;

import org.example.backend.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    public void saveCustomer(CustomerDTO customerDTO);
    public void updateCustomer(CustomerDTO customerDTO);
    public void deleteCustomer(String customerId);
    public List<CustomerDTO> getAllCustomer();
}
