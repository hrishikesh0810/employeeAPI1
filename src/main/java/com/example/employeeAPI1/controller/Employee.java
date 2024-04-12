package com.example.employeeAPI1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeAPI1.entity.EmployeeEntity;
import com.example.employeeAPI1.service.EmployeeService;

@RestController
public class Employee {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/getEmployee/{id}")
	public ResponseEntity<EmployeeEntity> getEmployee(@PathVariable int id){
		
		EmployeeEntity employeeEntity = null;
		try {
			
			employeeEntity = employeeService.getEmployee(id);
			
		} catch (Exception e) {
			throw new NullPointerException("Data not Available");
		}
		return new ResponseEntity<EmployeeEntity>(employeeEntity,HttpStatus.OK);
	}
	
	@PostMapping("/saveEmployee")
	public ResponseEntity<String> saveEmployee(@RequestBody EmployeeEntity employeeEntity){
		
		try {
			employeeService.saveEmployee(employeeEntity);
		} catch (Exception e) {
			throw new NullPointerException("Data not Saved");
		}
		return new ResponseEntity<String>("Employee data saved for Emp Id = " +employeeEntity.getId(),HttpStatus.OK);
	}
}
