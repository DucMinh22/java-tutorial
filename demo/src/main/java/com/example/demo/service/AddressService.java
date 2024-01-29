package com.example.demo.service;

import com.example.demo.model.Address;
import com.example.demo.model.Employee;
import com.example.demo.repo.AddressRepository;
import com.example.demo.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    private final AddressRepository addressRepository;
    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public List<Address> getAllAddress() {
        return addressRepository.findAll();
    }
}
