import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(Config.class);
		CollegeBean  college=context.getBean("collegeBean",CollegeBean.class);
		college.col();
	}

}
