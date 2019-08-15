package com.main.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.main.model.Employee;
@Repository
public interface EmployeeDaoIntf {
	
	
	void create(Employee emp);
	List<Employee> fetchAll();
	Employee getAll(int id);
	Employee change(Employee emp);
	void delete(int id);
	

}
