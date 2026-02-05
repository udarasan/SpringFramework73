package org.example.backend.service.custom.impl;

import lombok.RequiredArgsConstructor;
import org.example.backend.dto.CustomerDTO;
import org.example.backend.entity.Customer;
import org.example.backend.repository.CustomerRepository;
import org.example.backend.service.custom.CustomerService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public void saveCustomer(CustomerDTO customerDTO) {
       customerRepository.save(
               new Customer(
                       customerDTO.getcId(),
                       customerDTO.getcName(),
                       customerDTO.getcAddress()));
    }

    @Override
    public void updateCustomer(CustomerDTO customerDTO) {
        customerRepository.save(new Customer(
                customerDTO.getcId(), customerDTO.getcName(), customerDTO.getcAddress()
        ));
    }

    @Override
    public void deleteCustomer(String customerId) {
        customerRepository.deleteById(customerId);
    }

    @Override
    public void getAllCustomer() {
        customerRepository.findAll();
    }

}
