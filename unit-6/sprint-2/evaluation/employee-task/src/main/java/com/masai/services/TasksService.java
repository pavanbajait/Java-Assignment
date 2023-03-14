package com.masai.services;

import java.util.List;

import com.masai.entity.Tasks;
import com.masai.exception.TasksException;

public interface TasksService {

	Tasks createTask(Tasks task) throws TasksException;

	List<Tasks> getAllTasksStartToEndDate(double start, double end) throws TasksException;

	Tasks deleteTasks(Integer id) throws TasksException;

	Tasks updateTasks(Integer id,Tasks task)throws TasksException;

}
