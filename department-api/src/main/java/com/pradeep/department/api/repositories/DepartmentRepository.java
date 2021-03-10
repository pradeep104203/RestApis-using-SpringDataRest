package com.pradeep.department.api.repositories;

import org.springframework.data.repository.CrudRepository;

import com.pradeep.department.api.entities.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
