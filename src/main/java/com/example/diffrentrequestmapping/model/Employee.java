package com.example.diffrentrequestmapping.model;

import com.example.diffrentrequestmapping.dto.AnotherDTO;
import com.example.diffrentrequestmapping.dto.EmployeeDTO;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "emp_payroll")
public @Data class Employee {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "employee_id")
   private int id;
   // @Column(name = "firstName")
   private String fName;
   //  @Column(name = "lastName")
   private String lName;
   // @Column(name = "emp_email")
   private String email;
   // @Column(name = "phoneNumber")
   private String phoneNumber;
   //  @Column(name = "address")
   private String address;
   //  @Column(name = "salary")
   private double salary;
   //  @Column(name = "gender")
   private String gender;
   //  @Column(name = "startDate")
   private String startDate;
   //  @Column(name = "note")
   private String note;
   // @Column(name = "ProfilePic")
   private String profilePic;




   @ElementCollection
   @CollectionTable(name = "emp_department", joinColumns = @JoinColumn(name = "id"))
   @Column(name = "department")
   private List<String> departments;



   public Employee(AnotherDTO anotherDTO) {
     // this.updateEmployee(anotherDTO);
   }

   public Employee(EmployeeDTO employeeDTO, AnotherDTO anotherDTO) {
    //  this.updateEmployee( employeeDTO,anotherDTO);
   }

  public Employee(EmployeeDTO employeeDTO) { this.updateEmployee(employeeDTO);
   }



   public void updateEmployee(EmployeeDTO employeeDTO) {
      this.fName = employeeDTO.getFName();
      this.lName = employeeDTO.getLName();
      this.email = employeeDTO.getEmail();
      this.phoneNumber = employeeDTO.getPhoneNumber();
      this.address = employeeDTO.getAddress();
      this.salary = employeeDTO.getSalary();
      this.gender = employeeDTO.getGender();
      this.startDate = employeeDTO.getStartDate();
      this.note = employeeDTO.getNote();
      this.profilePic = employeeDTO.getProfilePic();
      this.departments = employeeDTO.getDepartments();
      //  this.dept = employeeDTO.getDept();
   }


//   public void updateEmployee(AnotherDTO anotherDTO){
//      this.name=anotherDTO.getName();
//      this.age=anotherDTO.getAge();
//      this.poosition=anotherDTO.getPosition();
//
//   }
}
