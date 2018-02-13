package controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import data.entity.Company;
import data.entity.Currency;
import data.entity.Employee;
import data.entity.Offering;
import data.entity.OfferingGroup;
import data.entity.UnitOfMeasurement;
import data.json.Views;
import service.inteface.CompanyService;
import service.inteface.CurrencyService;
import service.inteface.EmployeeService;
import service.inteface.OfferingGroupService;
import service.inteface.OfferingService;
import service.inteface.UnitOfMeasurementService;

@Controller
public class JspController {
	
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private CurrencyService currencyService;
	@Autowired
	private CompanyService companyService;
	@Autowired
	private UnitOfMeasurementService unitOfMeasurementService;
	@Autowired
	private OfferingGroupService offeringGroupService;
	@Autowired
	private OfferingService offeringService;
	@Autowired
	private ObjectMapper jacksonObjectMapper;
	
	@RequestMapping(value="/", method=GET)
	public String home(Model model) {
		Employee currentUser = employeeService.getCurrentlyLoggedEmployee();
		Collection<Employee> employees = employeeService.readAll();
		Collection<Currency> currencies = currencyService.readAll();
		Collection<Company> companies = companyService.readAll();
		Collection<UnitOfMeasurement> units = unitOfMeasurementService.readAll();
		Collection<OfferingGroup> offeringGroups = offeringGroupService.readAll();
		Collection<Offering> offerings = offeringService.readAll();
		
		model.addAttribute("currentUser", currentUser);
		model.addAttribute("employees", employees);
		model.addAttribute("currencies", currencies);
		model.addAttribute("companies", companies);
		model.addAttribute("units", units);
		model.addAttribute("offeringGroups", offeringGroups);
		model.addAttribute("offerings", offerings);
		
		return "home";
	}
	
	@RequestMapping(value="/NewInvoice", method=GET)
	public String newInvoice(Model model) {
		Employee currentUser = employeeService.getCurrentlyLoggedEmployee();
		Company currentUserCompanyWithOfferings = 
				companyService.getCurrentlyLoggedEmployeeCompanyWithOfferings();
		Collection<Company> otherCompanies = companyService.readAllExceptCurrentEmployees();
		
		String currentCompanyJson = "";
		try {
			currentCompanyJson = 
				jacksonObjectMapper
					.writerWithView(Views.CompanyWithAllOfferings.class)
					.writeValueAsString(currentUserCompanyWithOfferings);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		String otherCompaniesJson = "";
		try {
			otherCompaniesJson = 
				jacksonObjectMapper
					.writerWithView(Views.CompanyWithAllOfferings.class)
					.writeValueAsString(otherCompanies);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		model.addAttribute("currentUser", currentUser);
		model.addAttribute("currentCompany", currentUserCompanyWithOfferings);
		model.addAttribute("currentCompanyJson", currentCompanyJson);
		model.addAttribute("otherCompanies", otherCompanies);
		model.addAttribute("otherCompaniesJson", otherCompaniesJson);
		
		return "newInvoice";
	}
}
