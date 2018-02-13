package service.implementation;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import data.entity.Employee;
import data.repository.EmployeeRepository;
import service.inteface.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Override
	public Employee create(Employee employee) {
		Employee savedEmployee = employeeRepo.save(employee);
		return savedEmployee;
	}
	
	@Override
	public Employee getCurrentlyLoggedEmployee() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		Object principal = auth.getPrincipal();
		Employee currentlyLogged = (Employee) principal;
		return currentlyLogged;
	}

	@Override
	public Employee readById(Integer id) {
		Employee readEmployee = employeeRepo.getOne(id);
		return readEmployee;
	}

	@Override
	public Collection<Employee> readAll() {
		Collection<Employee> allEmployees = employeeRepo.findAll();
		return allEmployees;
	}

}
