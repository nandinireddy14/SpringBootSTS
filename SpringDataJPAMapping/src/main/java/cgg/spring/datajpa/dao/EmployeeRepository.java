package cgg.spring.datajpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cgg.spring.datajpa.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
