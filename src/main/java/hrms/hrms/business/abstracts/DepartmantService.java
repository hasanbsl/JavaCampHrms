package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.entities.concretes.Department;

public interface DepartmantService {

	List<Department> getAll();
}
