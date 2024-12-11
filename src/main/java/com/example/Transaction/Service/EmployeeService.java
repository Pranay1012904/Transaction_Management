package com.example.Transaction.Service;

import com.example.Transaction.Entity.Address;
import com.example.Transaction.Entity.Employee;
import com.example.Transaction.Repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeService {

    EmployeeRepository employeeRepository;

    AddressService addressService;

    @Transactional
    public void addEmp(Employee employee,Address address){
          Employee savedEmp=  employeeRepository.save(employee);
          address.setEmployee(savedEmp);
          address.setState(null);
          addressService.addEmp(address);
    }
}
