package hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext("EmployeeConfig.class");
        EmployeeDao dao=(EmployeeDao) context.getBean("employeeDao",EmployeeDao.class);
		Employee emp=new Employee();
		emp.setEno(111);
		emp.setName("abc");
		emp.setEno(10000);
}
}
