package com.example.employeeAPI1.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeeAPI1.entity.EmployeeEntity;
import com.example.employeeAPI1.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	public EmployeeEntity getEmployee(int id) {
	
		Optional<EmployeeEntity> employeeEntity = employeeRepo.findById(id);
		
		return employeeEntity.get();
		
	}
	
	public void saveEmployee(EmployeeEntity employeeEntity) {
		
		employeeRepo.save(employeeEntity);
	}
}
