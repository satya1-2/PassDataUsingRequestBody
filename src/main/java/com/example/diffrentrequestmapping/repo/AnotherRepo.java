package com.example.diffrentrequestmapping.repo;

import com.example.diffrentrequestmapping.model.Another;
import com.example.diffrentrequestmapping.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AnotherRepo extends JpaRepository<Another, Integer> {
}
