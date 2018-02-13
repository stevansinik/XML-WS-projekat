package data.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonView;

import data.json.Views;

@Entity
public class OfferingGroup {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable=false)
	private String name;
	@Column(nullable=false)
	private BigDecimal tax;
	@Column
	private BigDecimal discountPercentage;
	@Column
	private BigDecimal discountAmmount;
	@JsonView(Views.OfferingGroupCompany.class)
	@ManyToOne
	private Company company;
	@JsonView(Views.OfferingGroupOfferings.class)
	@OneToMany(mappedBy="group")
	private Set<Offering> offerings = new HashSet<Offering>();
	
	public OfferingGroup() {
	}
	public OfferingGroup(String name, BigDecimal tax, BigDecimal discountPercentage, BigDecimal discountAmmount,
			Company company) {
		super();
		this.name = name;
		this.tax = tax;
		this.discountPercentage = discountPercentage;
		this.discountAmmount = discountAmmount;
		company.getOfferingGroups().add(this);
		this.company = company;
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
	public BigDecimal getTax() {
		return tax;
	}
	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}
	public BigDecimal getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(BigDecimal discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public BigDecimal getDiscountAmmount() {
		return discountAmmount;
	}
	public void setDiscountAmmount(BigDecimal discountAmmount) {
		this.discountAmmount = discountAmmount;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Set<Offering> getOfferings() {
		return offerings;
	}
	public void setOfferings(Set<Offering> offerings) {
		this.offerings = offerings;
	}
	public void addOffering(Offering offering) {
		offering.setGroup(this);
		offerings.add(offering);
	}
	
	public void removeOffering(Offering offering) {
		if(offerings.contains(offering)) {
			offerings.remove(offering);
		}
		offering.setGroup(null);
	}
}
