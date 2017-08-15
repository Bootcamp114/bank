package bank.service;

import java.util.List;

import bank.model.Employee;

public interface EmployeeService {

	public void save(Employee employee);

	public void update(Employee employee);

	public void delete(int id);

	public List<Employee> getAllEmployee();

	public Employee getEmployeeById(int id);
}