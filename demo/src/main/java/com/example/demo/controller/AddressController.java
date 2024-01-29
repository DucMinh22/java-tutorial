package com.example.demo.controller;

import com.example.demo.model.Address;
import com.example.demo.model.Employee;
import com.example.demo.service.AddressService;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    private final AddressService addressService;
    @Autowired

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Address>> getAllAddresses () {
        List<Address> addresses = addressService.getAllAddress();
        return new ResponseEntity<>(addresses, HttpStatus.OK );
    }
}
