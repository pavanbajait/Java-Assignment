package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.masai.entity.Employee;
import com.masai.entity.Tasks;

public interface TasksDao  extends JpaRepository<Tasks, Integer>{

	@Query("select p from Tasks p where p.deadline > ?1 AND p.deadline < ?2")
	List<Tasks> getAllTasksStartToEndDate(double start, double end);

}
