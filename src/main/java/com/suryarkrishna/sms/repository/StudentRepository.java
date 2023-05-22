package com.suryarkrishna.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.suryarkrishna.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	

}
 