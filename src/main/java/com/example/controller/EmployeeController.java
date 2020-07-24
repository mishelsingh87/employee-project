package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.modal.Employee;
import com.example.repository.EmployeeRepository;

@RestController
@RequestMapping("/cisco/")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository repository;
	
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee() {
		return repository.findAll();
	}
	
	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return repository.save(employee);
	}
	
	@PutMapping("/employee/{id}")
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable(name="id") Long empId) {
		return repository.save(employee);
	}
	
	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable(value = "id") Long empId) {
		repository.deleteById(empId);
	}
}
