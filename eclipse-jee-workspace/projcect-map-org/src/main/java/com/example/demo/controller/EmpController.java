package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Employee;
import com.example.demo.model.Organisation;
import com.example.demo.service.EService;
import com.example.demo.service.OrgService;
@RestController
public class EmpController {
	@Autowired
	public EService eService;
	@Autowired
	public OrgService orgService;
	@GetMapping("/display")
	public List<Employee> emplist() {
		return eService.getEmployee();
	}
	@GetMapping("/display/{e_id}")
	public Employee emplist(@PathVariable Long e_id) {
		return eService.getById(e_id);
	}
    @GetMapping("/orgdisplay")
    public List<Organisation> orglist() { 
    	return orgService.getOrg(); 
    } 
    //org wise emp
    @GetMapping("/oedisplay/{id}")
    public List<Employee> oemplist(@PathVariable Long id){
    	Organisation o=orgService.getById(id);
    	return o.getEmployee();
    }
	@PostMapping("/save")
	public void saveOrg(@RequestBody Organisation organisation) {
		orgService.saveOrg(organisation);
	}
	@PostMapping("/saveemp/{id}")
	public void saveEmployeeId(@RequestBody Employee employee,@PathVariable Long id) {
		Organisation o=orgService.getById(id);
		o.getEmployee().add(employee);
		orgService.saveOrg(o);
	}
	@PostMapping("/saveid/{id}")
	public void saveEmployeeId(@RequestBody Organisation organisation,@PathVariable Long id) {
		orgService.saveOrgId(organisation,id);
	}
	@PutMapping("/updateOrg/{id}")
	public void updateOrg(@RequestBody Organisation organisation,@PathVariable Long id) {
		Organisation o=orgService.getById(id);
		o.setName(organisation.getName());
		orgService.saveOrg(o);
	}
	@PutMapping("/update/{e_id}")
	public void updateEmployee(@PathVariable Long e_id,@RequestBody Employee employee) {
		eService.updateEmployee(employee,e_id);
	}
	//add employee into different organization
	@PutMapping("/orgupdate/{e_id}/{id}")
	public void emporg(@PathVariable Long e_id,@PathVariable Long id) {
		Organisation o=orgService.getById(id);
		Employee e=eService.getById(e_id);
		List<Employee> emp=o.getEmployee();
		emp.add(e);
		orgService.saveOrg(o);
	}
	/*
	 * @PutMapping("/empdel/{id}/{e_id}") public void empdel(@PathVariable Long
	 * id,@PathVariable Long e_id) { Organisation o=orgService.getById(id);
	 * for(Employee x:o.getEmployee()) { if(x.getE_id() == e_id) {
	 * o.getEmployee().remove(x); break; } } orgService.saveOrg(o); }
	 */
	@PutMapping("/empdel/{e_id}/{id}")
	public void deleteemployeeby(@PathVariable Long e_id, @PathVariable Long id) {
		Organisation o = orgService.getById(id);
		o.getEmployee().remove(eService.getById(e_id));
		orgService.saveOrg(o);
        eService.deleteEmployee(e_id);
	}
	@DeleteMapping("/delete/{e_id}")
	public void deleteEmployee(@PathVariable Long e_id) {
		eService.deleteEmployee(e_id);
	}
	@DeleteMapping("/orgdelete/{id}")
	public void deleteOrganisation(@PathVariable Long id) {
		orgService.deleteOrg(id);
	}
}
