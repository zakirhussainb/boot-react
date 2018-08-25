package com.example.demo.repository;

import com.example.demo.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("employeeRepository")
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
