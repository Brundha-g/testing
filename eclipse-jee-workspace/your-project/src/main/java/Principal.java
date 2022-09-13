import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Principal {
	@Value("${id}")
	public int id;
	@Value("${name}")
	public String s;
	public void princy() {
		System.out.println("i am "+s+"your princy"+"  my id is "+id);
	}

}
