package org.example.backend.service.custom.impl;

import lombok.RequiredArgsConstructor;
import org.example.backend.dto.CustomerDTO;
import org.example.backend.entity.Customer;
import org.example.backend.exception.CustomException;
import org.example.backend.repository.CustomerRepository;
import org.example.backend.service.custom.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void saveCustomer(CustomerDTO customerDTO) {
        if (customerDTO==null) {
            throw new CustomException("Customer DTO is null");
        }
        customerRepository.save(modelMapper.map(customerDTO, Customer.class));
    }

    @Override
    public void updateCustomer(CustomerDTO customerDTO) {
        if (customerDTO==null) {
            throw new CustomException("Customer DTO is null");
        }
        customerRepository.save(modelMapper.map(customerDTO, Customer.class));
    }

    @Override
    public void deleteCustomer(String customerId) {
        customerRepository.deleteById(customerId);
    }

    @Override
    public List<CustomerDTO> getAllCustomer() {
       List<Customer> list= customerRepository.findAll();
       return list.stream().map(
               customer -> modelMapper.map(customer, CustomerDTO.class))
               .toList();

    }

}
