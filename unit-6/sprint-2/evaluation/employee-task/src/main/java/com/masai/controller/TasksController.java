package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.masai.entity.Employee;
import com.masai.entity.Tasks;
//import com.masai.exception.EmployeeException;
import com.masai.exception.TasksException;
import com.masai.services.TasksService;

@RestController
public class TasksController {
	
	@Autowired
	private TasksService service;
	
	@PostMapping("/task")
	public Tasks createTasks(@RequestBody Tasks task) throws TasksException {
		 
		return service.createTask(task);
		
	}


	@GetMapping("/tasks")
	public ResponseEntity<List<Tasks>> getTasksFromStartDateToEndDate(@RequestParam double start , @RequestParam double end) throws TasksException{
		List<Tasks> tasks= service.getAllTasksStartToEndDate(start, end);
		return new ResponseEntity<List<Tasks>>(tasks,HttpStatus.OK);
	}
	

	@DeleteMapping("/tasks/{id}")
	public ResponseEntity<Tasks> deleteTasksById(@PathVariable("id") Integer id) throws TasksException{
		Tasks task=service.deleteTasks(id);
		return new ResponseEntity<Tasks>(task,HttpStatus.OK);
	}

	@PatchMapping("/tasks/{id}")
	public ResponseEntity<Tasks> updateTasks(@PathVariable("id") Integer id,@RequestBody Tasks task) throws TasksException{
		Tasks taskupd= service.updateTasks(id,task);

		return new ResponseEntity<Tasks>(taskupd,HttpStatus.OK);
	}
}
