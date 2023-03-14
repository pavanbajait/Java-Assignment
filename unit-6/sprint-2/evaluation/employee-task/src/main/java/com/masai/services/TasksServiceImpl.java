package com.masai.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.masai.entity.Employee;
import com.masai.entity.Tasks;
import com.masai.exception.EmployeeException;
import com.masai.exception.TasksException;
import com.masai.repository.TasksDao;

@Service
public class TasksServiceImpl implements TasksService{
	
	@Autowired
	private TasksDao dao;

	@Override
	public Tasks createTask(Tasks task) throws TasksException {
		Optional<Tasks> opt= dao.findById(task.getId());
		
		if(opt.isPresent()) {
			
			throw new TasksException("Tasks Already exist");
			//here save method will perform as saveOrUpdate based on Id field
		}
		else
			return dao.save(task);
	}

	@Override
	public List<Tasks> getAllTasksStartToEndDate(double start, double end) throws TasksException {
		List<Tasks> tasks= dao.getAllTasksStartToEndDate(start, end);
		
		if(tasks.size() > 0)
			return tasks;
		else
			throw new TasksException("No Tasks found within "+start+" date to "+ end +" date");
	}

	@Override
	public Tasks deleteTasks(Integer id) throws TasksException {
		Tasks existingTasks= dao.findById(id).orElseThrow(() -> new TasksException("Tasks does not exist with Tasks Id "+id));;
		
		dao.delete(existingTasks);
				
		return existingTasks;
	}

	@Override
	public Tasks updateTasks(Integer id, Tasks task) throws TasksException {
		Tasks obj = dao.findById(id).orElseThrow(() -> new TasksException("Plant not found "));
        dao.delete(obj);
        dao.save(task);
		 return task;
	      
	}
	

	

}
