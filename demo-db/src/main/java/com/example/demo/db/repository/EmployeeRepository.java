package com.example.demo.db.repository;

import com.example.demo.db.entity.EmployeeTbl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<EmployeeTbl, Long> {

    List<EmployeeTbl> findByName(String name);

    List<EmployeeTbl> findByNameAndDepartment(String name, String department);
}