package service.implementation;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import data.entity.Company;
import data.entity.Employee;
import data.repository.CompanyRepository;
import service.inteface.CompanyService;
import service.inteface.EmployeeService;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyRepository companyRepo;
	
	@Autowired
	private EmployeeService employeeService;
	
	@Override
	public Company create(Company company) {
		Company savedCompany = companyRepo.save(company);
		return savedCompany;
	}

	@Override
	public Company readById(Integer id) {
		Company readCompany = companyRepo.getOne(id);
		return readCompany;
	}
	
	@Override
	@Transactional(readOnly = true)
	public Company getCurrentlyLoggedEmployeeCompany() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		Object principal = auth.getPrincipal();
		Employee currentlyLogged = (Employee) principal;
		Company company = currentlyLogged.getCompany();
		return company;
	}
	
	@Override
	@Transactional(readOnly = true)
	public Company getCurrentlyLoggedEmployeeCompanyWithOfferings() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		Object principal = auth.getPrincipal();
		Employee currentlyLogged = (Employee) principal;
		Company company = currentlyLogged.getCompany();
		Company companyWithOfferings = companyRepo.readById(company.getId());
		return companyWithOfferings;
	}

	@Override
	public Collection<Company> readAll() {
		Collection<Company> allCompanies = companyRepo.findAll();
		return allCompanies;
	}
	
	@Override
	public Collection<Company> readAllExceptCurrentEmployees() {
		Collection<Company> allCompanies = companyRepo.findAll();
		Company currentUsersCompany = getCurrentlyLoggedEmployeeCompany();
		ArrayList<Company> allCompaniesExceptCurrentEmployees = 
				new ArrayList<Company>();
		for(Company company : allCompanies) {
			if(!company.getId().equals(currentUsersCompany.getId())) {
				allCompaniesExceptCurrentEmployees.add(company);
			}
		}
		return allCompaniesExceptCurrentEmployees;
	}

}
