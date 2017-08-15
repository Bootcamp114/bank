package bank.service;

import java.util.List;

import bank.model.Employee;

public interface EmployeeService {

	public void save(Employee employee);
	
	public List<Employee> getAllEmployee();
}
