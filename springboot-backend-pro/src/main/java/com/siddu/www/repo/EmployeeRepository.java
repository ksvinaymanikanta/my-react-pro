package com.siddu.www.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.siddu.www.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>
{

}