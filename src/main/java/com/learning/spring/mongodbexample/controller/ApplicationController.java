package com.learning.spring.mongodbexample.controller;

import com.learning.spring.mongodbexample.model.Customer;
import com.learning.spring.mongodbexample.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApplicationController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping(value = "/customer/add", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        customerRepository.save(customer);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @GetMapping(value = "/customer/get/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Customer getCustomer(@PathVariable String name) {
        return customerRepository.findByName(name);
    }

    @GetMapping(value = "/customer/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Customer> getCustomer() {
        return customerRepository.findAll();
    }

}
