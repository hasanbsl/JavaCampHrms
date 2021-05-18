package hrms.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="job_seeker")
public class JobSeeker {
	
	
		
		@Id
		@GeneratedValue
		@Column(name="id")
		private int id;
		
		@Column(name="user_id")
		private int userId;
		
		@Column(name="first_name")
		private String fistName;
		
		@Column(name="last_name")
		private String lastName;
		
		@Column(name="identity_number")
		private String identityNumber;
		
		@Column(name="birth_day")
		private Date birthDay;
		
  
}
	
