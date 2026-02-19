package org.example.backend.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.backend.dto.CustomerDTO;
import org.example.backend.service.custom.CustomerService;
import org.example.backend.util.APIResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping
    public ResponseEntity<APIResponse<String>> saveCustomer(@RequestBody @Valid CustomerDTO customerDTO) {
        customerService.saveCustomer(customerDTO);
        return new ResponseEntity(new APIResponse<>(
                201,"Customer Saved",null
        ), HttpStatus.CREATED);

    }
    @GetMapping
    public ResponseEntity<APIResponse<String>> getAllCustomers() {
        List<CustomerDTO> list=customerService.getAllCustomer();
        return new ResponseEntity(new APIResponse<>(
                201,"Customer Saved",list
        ), HttpStatus.CREATED);
    }
}
