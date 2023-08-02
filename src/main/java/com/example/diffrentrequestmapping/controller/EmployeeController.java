package com.example.diffrentrequestmapping.controller;

import com.example.diffrentrequestmapping.dto.AnotherDTO;
import com.example.diffrentrequestmapping.dto.EmployeeDTO;
import com.example.diffrentrequestmapping.dto.ResponseDTO;
import com.example.diffrentrequestmapping.model.Another;
import com.example.diffrentrequestmapping.model.Employee;
import com.example.diffrentrequestmapping.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")

     public class EmployeeController {

        @Autowired
        private EmployeeService employeeService;

        @PostMapping("/another")
        public ResponseEntity<ResponseDTO> handleAnotherRequest( @RequestBody AnotherDTO anotherDTO) {
            Another employee = employeeService.handleAnotherRequest(anotherDTO);
            ResponseDTO responseDTO = new ResponseDTO("Another request handled Successfully", employee);
            return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
        }

        @PostMapping(value = "/json", consumes = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity<ResponseDTO> handleJsonRequest( @RequestBody EmployeeDTO employeeDTO) {
            Employee employee = employeeService.handleJsonRequest(employeeDTO);
            ResponseDTO responseDTO = new ResponseDTO("JSON request handled Successfully", employee);
            return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
        }

        @PostMapping(value = "/xml", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity<ResponseDTO> handleXmlRequest( @RequestBody EmployeeDTO employeeDTO) {
            Employee employee = employeeService.handleXmlRequest(employeeDTO);
            ResponseDTO responseDTO = new ResponseDTO("XML request handled Successfully", employee);
            return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
        }

        @PostMapping("/multiple")
        public ResponseEntity<ResponseDTO> handleMultipleRequests(
                 @RequestBody EmployeeDTO employeeDTO,
                 @RequestBody AnotherDTO anotherDTO
        ) {
            Employee employee = employeeService.handleMultipleRequests(employeeDTO, anotherDTO);
            ResponseDTO responseDTO = new ResponseDTO("Multiple requests handled Successfully", employee);
            return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
        }

    }
