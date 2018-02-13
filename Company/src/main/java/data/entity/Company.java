package data.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.NamedEntityGraphs;
import javax.persistence.NamedSubgraph;
import javax.persistence.OneToMany;

@Entity
@NamedEntityGraphs({
	@NamedEntityGraph(
		name = "graph.Company.allOfferings",
		attributeNodes = {
			@NamedAttributeNode(
				value="offeringGroups", 
				subgraph = "subgraph.OfferingGroup.offerings"
			)
		},
		subgraphs = {
			@NamedSubgraph(
				name = "subgraph.OfferingGroup.offerings",
				attributeNodes = {
					@NamedAttributeNode("offerings")
				}, 
				type = OfferingGroup.class
			)
		}
)})
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false, length = 255)
	private String name;
	@Column(nullable = false, length = 255)
	private String address;
	@Column(nullable = false, unique = true, length = 11)
	private String pibNumber;
	@ManyToOne
	private Currency currency;
	@OneToMany(mappedBy = "company")
	private Set<Employee> employees = new HashSet<Employee>();
	@OneToMany(mappedBy = "company")
	private Set<OfferingGroup> offeringGroups = new HashSet<OfferingGroup>();
	// @OneToMany
	// private Set<BankAccount> accounts = new HashSet<BankAccount>();

	public Company() {
	}
	public Company(String name, String address, String pibNumber, Currency currency) {
		this.name = name;
		this.address = address;
		this.pibNumber = pibNumber;
		this.currency = currency;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPibNumber() {
		return pibNumber;
	}
	public void setPibNumber(String pibNumber) {
		this.pibNumber = pibNumber;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	public Set<OfferingGroup> getOfferingGroups() {
		return offeringGroups;
	}
	public void setOfferingGroups(Set<OfferingGroup> offeringGroups) {
		this.offeringGroups = offeringGroups;
	}
	
	public void addEmployee(Employee employee) {
		employee.setCompany(this);
		employees.add(employee);
	}
	public void removeEmployee(Employee employee) {
		if(employees.contains(employee)) {
			employees.remove(employee);
		}
		employee.setCompany(null);
	}
	
	public void addOfferingGroup(OfferingGroup offeringGroup) {
		offeringGroup.setCompany(this);
		offeringGroups.add(offeringGroup);
	}
	public void removeOfferingGroup(OfferingGroup offeringGroup) {
		if(offeringGroups.contains(offeringGroup)) {
			offeringGroups.remove(offeringGroup);
		}
		offeringGroup.setCompany(null);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pibNumber == null) ? 0 : pibNumber.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		if (pibNumber == null) {
			if (other.pibNumber != null)
				return false;
		} else if (!pibNumber.equals(other.pibNumber))
			return false;
		return true;
	}
	
	
}
