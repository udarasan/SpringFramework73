package org.example.backend.service.custom.impl;

import org.example.backend.dto.CustomerDTO;
import org.example.backend.service.custom.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public void saveCustomer(CustomerDTO customerDTO) {
        System.out.println("CustomerService.saveCustomer");
        System.out.println(customerDTO.getcId());
        System.out.println(customerDTO.getcName());
        System.out.println(customerDTO.getcAddress());
    }
}
