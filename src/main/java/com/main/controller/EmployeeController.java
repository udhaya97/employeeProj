package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.main.model.Employee;
import com.main.service.EmployeeServiceIntf;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeServiceIntf empServ;
	
	@RequestMapping("/one")
	public ModelAndView one(@ModelAttribute("employee") Employee employee)
	{
		return new ModelAndView("one");
	}
	
	
	//create operation
	@RequestMapping("/first")
	public ModelAndView firstMethod(@ModelAttribute("employee") Employee employee)
	{
		return new ModelAndView("first");
		
	}
	//saving to database
	@RequestMapping("/save")
	public ModelAndView create(@ModelAttribute("employee") Employee employee)
	{
		empServ.create(employee);
		System.out.println("data Saved Successfully");
		return new ModelAndView("redirect:/getall");
		
	}
	//list all operation
	@RequestMapping("/getall")
	public ModelAndView list(@ModelAttribute("employee") Employee employee)
	{
		
		List<Employee> lis=empServ.fetchAll();
		System.out.println("Data Listed Success fully");
		return new ModelAndView("getall","listall",lis);
		
	}
	//update operation
	@RequestMapping("/third/{empId}")
	public ModelAndView thirdMethod(@PathVariable("empId") int i,@ModelAttribute("employee") Employee emp)
	{
	int id=i;	
		Employee list = empServ.getAll(id);
		System.out.println("Data entered third get id path :"+emp.getEmpId()+" "+id);
		
		return new ModelAndView("third","listall",list);
		
	}
	//update operation cont...
	@RequestMapping("/update/{empId}")
	public ModelAndView update(@ModelAttribute("employee") Employee emp,@PathVariable(name="empId") int empId)
	{
	
		
		Employee lis =empServ.getAll(empId);
		
		
			if(lis.getEmpId()==empId)
			{
				
				System.out.println("employee id from list is "+lis.getEmpId());
				System.out.println("emp id from jsp page"+emp.getEmpId());
				System.out.println("emp name"+emp.getEmpName());
				
			empServ.change(emp);
			}
		
		System.out.println("Data updated Success fully");
		return new ModelAndView("redirect:/getall");
		
	}
	//delete operation
	@RequestMapping("/fourth/{empId}")
	public ModelAndView delete(@PathVariable("empId") int id,@ModelAttribute("employee") Employee emp)
	{
		
		empServ.delete(id);
		System.out.println("Data deleted from database");
		return new ModelAndView("redirect:/getall");
		
	}
	//saving or loading data
	@PostMapping("/saved")
	public String saved(@RequestBody Employee employee)
	{
		empServ.create(employee);
		
		return "hai";
	}
	//listing or fetching data
	@GetMapping("/getalll")
	public List<Employee> fetAll()
	{
		List<Employee> lis = empServ.fetchAll();
		return lis;
	}
	//updating
@PutMapping("/updated/{id}")
public Employee updating(@PathVariable("id") int id,@RequestBody Employee emp)
{
	
	
		
		Employee lis =empServ.getAll(id);
		
		
			if(lis.getEmpId()==id)
			{
				
				
				
			empServ.change(emp);
			}
		
		return emp;
}
//deleted
@DeleteMapping("/delet/{id}")
public String dele(@PathVariable("id") int id)
{
	empServ.delete(id);
	return "deleted successfully";
}
}
