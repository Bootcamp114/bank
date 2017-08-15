package bank.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bank.model.Employee;

@Repository
public class EmployeeDaoImple implements EmployeeDao{
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(employee);
		session.flush();
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<Employee> employee = session.createCriteria(Employee.class).list();
		return employee;
	}

}
