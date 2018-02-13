package service.inteface;

import java.util.Collection;

import data.entity.Employee;

public interface EmployeeService {
	Employee create(Employee employee);
	Employee readById(Integer id);
	Employee getCurrentlyLoggedEmployee();
	Collection<Employee> readAll();
}
