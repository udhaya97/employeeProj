package com.main.repo;




import org.springframework.data.repository.CrudRepository;

import com.main.model.Employee;

public interface EmployeeRepo extends CrudRepository<Employee,Integer> {

	
	Employee findByEmpId(int id);

}
