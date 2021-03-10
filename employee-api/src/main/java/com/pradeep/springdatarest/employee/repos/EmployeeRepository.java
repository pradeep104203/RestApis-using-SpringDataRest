package com.pradeep.springdatarest.employee.repos;

import org.springframework.data.repository.CrudRepository;

import com.pradeep.springdatarest.employee.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
