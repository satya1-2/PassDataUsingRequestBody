package com.example.diffrentrequestmapping.service;


import com.example.diffrentrequestmapping.dto.AnotherDTO;
import com.example.diffrentrequestmapping.dto.EmployeeDTO;
import com.example.diffrentrequestmapping.model.Another;
import com.example.diffrentrequestmapping.model.Employee;
import com.example.diffrentrequestmapping.repo.AnotherRepo;
import com.example.diffrentrequestmapping.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    private AnotherRepo anotherRepo;

    public Another handleAnotherRequest(AnotherDTO anotherDTO) {

        Another employeeData = new Another(anotherDTO);
        return anotherRepo.save(employeeData);
    }
    public Employee handleJsonRequest(EmployeeDTO employeeDTO) {
        Employee employee = new Employee(employeeDTO);
        return employeeRepo.save(employee);
    }

    public Employee handleXmlRequest(EmployeeDTO employeeDTO) {
        Employee employee = new Employee(employeeDTO);
        return employeeRepo.save(employee);
    }

    public Employee  handleMultipleRequests(EmployeeDTO employeeDTO, AnotherDTO anotherDTO) {
        Employee employee = new Employee(employeeDTO,anotherDTO);
        return employeeRepo.save(employee);
    }
}