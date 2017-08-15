package bank.dao;

import java.util.List;

import bank.model.Employee;

public interface EmployeeDao {

	public void save(Employee employee);
	
	public List<Employee> getAllEmployee();
}
