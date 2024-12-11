package com.example.Transaction.Service;

import com.example.Transaction.Entity.Address;
import com.example.Transaction.Entity.Employee;
import com.example.Transaction.Repository.AddressRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AddressService {

    AddressRepository addressRepository;



    public void addEmp(Address address){
            addressRepository.save(address);

    }
}
