import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("default package")
@PropertySource("classpath:info.properties")
public class Config {
	/*
	 * @Bean public Principal principalBean() { return new Principal(); }
	 * 
	 * @Bean public College collegeBean() { College obj= new College();
	 * obj.setPrincipal(principalBean()); return obj; }
	 */

}
