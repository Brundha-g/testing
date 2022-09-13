package hibernate;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class EmployeeDaoImp implements EmployeeDao{
	String status;
	private HibernateTemplate hibernateTemplate;
	public void sethibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate=hibernateTemplate;
	}
	public String insertEmployee(Employee emp) {
		hibernateTemplate.save(emp);
		return "insetion succcess";
	}
	 public Employee searchEmployee(int eno) {
		 Employee emp=(Employee)hibernateTemplate.get(Employee.class,eno);
		 return emp;
	 }
	 public String updateEmployee(Employee emp) {
		 hibernateTemplate.update(emp);
		 return status;
	 }
	 public String deleteEmployee(int eno) {
		 hibernateTemplate.delete(eno);
		 return status;
	 }
}
