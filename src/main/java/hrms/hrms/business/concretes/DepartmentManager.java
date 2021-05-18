package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.DepartmantService;
import hrms.hrms.dataAccess.abstracts.DepartmentDao;
import hrms.hrms.entities.concretes.Department;

@Service
public class DepartmentManager implements DepartmantService {

	private DepartmentDao departmentDao;
	
	@Autowired
	public DepartmentManager(DepartmentDao departmentDao) {
		super();
		this.departmentDao = departmentDao;
	}
	
	@Override
	public List<Department> getAll() {
		
		return departmentDao.findAll();
	}

}
