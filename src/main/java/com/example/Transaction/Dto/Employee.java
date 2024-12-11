package com.example.Transaction.Dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "employee",
        "address"
})
@Generated
@AllArgsConstructor
public class Employee {

    @JsonProperty("employee")
    private List<Employee__1> employee;
    @JsonProperty("address")
    private List<Address> address;

    @JsonProperty("employee")
    public List<Employee__1> getEmployee() {
        return employee;
    }

    @JsonProperty("employee")
    public void setEmployee(List<Employee__1> employee) {
        this.employee = employee;
    }

    @JsonProperty("address")
    public List<Address> getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(List<Address> address) {
        this.address = address;
    }

}