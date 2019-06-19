package com.api.springboot2jpacrudexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.springboot2jpacrudexample.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
