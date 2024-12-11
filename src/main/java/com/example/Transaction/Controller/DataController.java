package com.example.Transaction.Controller;

import com.example.Transaction.Dto.Employee;
import com.example.Transaction.Dto.Employee__1;
import com.example.Transaction.Entity.Address;
import com.example.Transaction.Service.AddressService;
import com.example.Transaction.Service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empDetailApi")
@AllArgsConstructor
public class DataController {

    EmployeeService employeeService;

    @PostMapping("/setEmp")
    public ResponseEntity<Employee> getDetails(@RequestBody Employee employeeDto){

        employeeService.addEmp(getEmpData(employeeDto),getAddData(employeeDto));
        return new ResponseEntity<>(employeeDto, HttpStatus.OK);
    }

    public com.example.Transaction.Entity.Employee getEmpData(Employee employeeDto){
        List<Employee__1> emp=employeeDto.getEmployee();
        com.example.Transaction.Entity.Employee empEntity=new com.example.Transaction.Entity.Employee();
        empEntity.setfName(emp.get(0).getFirstName());
        empEntity.setlName(emp.get(0).getLastName());
        return empEntity;
    }

    public com.example.Transaction.Entity.Address getAddData(Employee employeeDto){
        List<com.example.Transaction.Dto.Address> add=employeeDto.getAddress();
        com.example.Transaction.Entity.Address addEntity=new com.example.Transaction.Entity.Address();
        addEntity.setCity(add.get(0).getCity());
        addEntity.setState(add.get(0).getState());
        return addEntity;
    }
}
