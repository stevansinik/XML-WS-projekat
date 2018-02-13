package service.inteface;

import java.util.Collection;

import data.entity.Company;

public interface CompanyService {
	Company create(Company company);
	Company readById(Integer id);
	Company getCurrentlyLoggedEmployeeCompany();
	Company getCurrentlyLoggedEmployeeCompanyWithOfferings();
	Collection<Company> readAll();
	Collection<Company> readAllExceptCurrentEmployees();
}
