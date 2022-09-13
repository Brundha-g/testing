package hibernate;

public interface EmployeeDao {
 public String insertEmployee(Employee emp);
 public Employee searchEmployee(int eno);
 public String updateEmployee(Employee emp);
 public String deleteEmployee(int eno);
}
