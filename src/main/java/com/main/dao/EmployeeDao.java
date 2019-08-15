package com.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.model.Employee;
import com.main.repo.EmployeeRepo;
@Repository
public class EmployeeDao implements EmployeeDaoIntf {

	@Autowired
	EmployeeRepo empRepo;
	@Override
	public void create(Employee emp) {
		empRepo.save(emp);

	}

	@Override
	public Employee getAll(int id) {
		Employee ls = (Employee) empRepo.findByEmpId(id);
		return ls;
	}

	@Override
	public Employee change(Employee emp) {
		Employee emp1 =empRepo.save(emp);
		return emp1;
	}

	@Override
	public void delete(int id) {
		empRepo.delete(id);

	}

	@Override
	public List<Employee> fetchAll() {
		
		List<Employee> list = (List<Employee>) empRepo.findAll();
		
		return list;
	}

}
