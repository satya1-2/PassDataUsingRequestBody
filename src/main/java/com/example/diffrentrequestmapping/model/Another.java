package com.example.diffrentrequestmapping.model;

import com.example.diffrentrequestmapping.dto.AnotherDTO;
import com.example.diffrentrequestmapping.dto.EmployeeDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Diffrent_data")
public class Another {
    @Id
    private int id;
    private String name;
    private  int age;

    private String position;

    public Another(AnotherDTO anotherDTO) {
        this.updateAnother(anotherDTO);
    }
        public void updateAnother(AnotherDTO anotherDTO) {
            this.name = anotherDTO.getName();
            this.age = anotherDTO.getAge();
            this.position = anotherDTO.getPosition();
    }
}
