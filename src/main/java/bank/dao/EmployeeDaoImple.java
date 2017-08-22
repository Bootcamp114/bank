package bank.dao;

import java.util.List;
import javax.persistence.OrderBy;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bank.model.Employee;

@Repository
public class EmployeeDaoImple implements EmployeeDao {

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
		List<Employee> employee = session.createQuery("from " + Employee.class.getName() + " order by id asc").list();
		// employee.addAll(Order.asc("id.value"));
		return employee;
	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(employee);
		session.flush();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Employee employee = new Employee();
		employee.setId(id);
		employee.setNama("~");
		session.delete(employee);
		session.flush();
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Employee employee = session.get(Employee.class, id);
		return employee;
	}
}