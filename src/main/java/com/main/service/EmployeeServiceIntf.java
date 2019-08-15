package com.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.main.model.Employee;

@Service
public interface EmployeeServiceIntf {
	void create(Employee emp);
	Employee getAll(int id);
	List<Employee> fetchAll();
	Employee change(Employee emp);
	void delete(int id);

}
