package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	
	
}
