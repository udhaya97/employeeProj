package com.main.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.dao.EmployeeDaoIntf;
import com.main.model.Employee;
@Service
@Transactional
public class EmployeeService implements EmployeeServiceIntf {

	@Autowired
	EmployeeDaoIntf empDao;
	@Override
	public void create(Employee emp) {
		
		empDao.create(emp);
	}

	@Override
	public Employee getAll(int id) {
		Employee ls = empDao.getAll(id);
		return ls;
	}

	@Override
	public Employee change(Employee emp) {
		Employee emp2 =empDao.change(emp);
		return emp2;
	}

	@Override
	public void delete(int id) {
		
		empDao.delete(id);

	}

	@Override
	public List<Employee> fetchAll() {
		List<Employee> list = empDao.fetchAll();
		return list;
	}

}
