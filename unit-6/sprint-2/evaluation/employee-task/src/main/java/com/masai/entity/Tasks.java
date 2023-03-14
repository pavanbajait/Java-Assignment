package com.masai.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@NoArgsConstructor
@Data
@ToString
@AllArgsConstructor
public class Tasks {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@NotEmpty
	@Size(min = 5, message = "Title must be min of 5 characters")
	private String title;
	
	@NotEmpty
	@Size(min = 2, message = "description is not valid")
	private String description;	
	
	@NotEmpty
	private boolean status;
	
	@NotNull
	private LocalDate deadline;
	
	@NotEmpty
	@Size(min = 2, message = "priority Name must be min of 2 characters")
	private String priority;
	
//	@NotNull
//	private Integer assigned_employee_id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Employee employee;


}
