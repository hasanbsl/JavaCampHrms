package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.DepartmantService;
import hrms.hrms.entities.concretes.Department;

@RestController
@RequestMapping("/api/departments")
public class DepartmentsController {
	
	private DepartmantService departmantService;

	@Autowired
	public DepartmentsController(DepartmantService departmantService) {
		super();
		this.departmantService = departmantService;
	}
	
	@GetMapping("/getall")
	public List<Department> getAll(){
		
		return this.departmantService.getAll();
	}

}
