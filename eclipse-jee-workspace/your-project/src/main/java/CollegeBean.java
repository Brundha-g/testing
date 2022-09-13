import org.springframework.stereotype.Component;
@Component
public class CollegeBean {
	private Principal principal;
	
	/*
	 * public College(Principal principal) { this.principal = principal; }
	 */

	public void col() {
		System.out.println("this is col");
		principal.princy();
	}

	
	  public void setPrincipal(Principal principal) { this.principal = principal; }
	 

}
