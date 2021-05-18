package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.entities.concretes.SystemPersonnel;

public interface SystemPersonnelService {
	
	List<SystemPersonnel> getAll();

}