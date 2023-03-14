package com.masai.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@NotEmpty
	@Size(min = 5, message = "name must be min of 5 characters")
	private String name;
	
	@Email(message = "Email is not valid")
	private String email;	
	
	@NotEmpty
	@Size(min = 2, message = "State Name must be min of 2 characters")
	private String state;
	
	@NotNull
	@Pattern(regexp = "[0-9]{10}",message = "Mobile No must have 10 digits")
	private String mobileNo;
	
	@NotEmpty
	@Size(min = 2, message = "Designation Name must be min of 2 characters")
	private String designation;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "employee")
	@JsonIgnore
	private List<Tasks> tasks=new ArrayList<>();

}
