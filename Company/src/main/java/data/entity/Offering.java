package data.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonView;

import data.json.Views;

@Entity
public class Offering {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false, length=120)
	private String name;
	@Enumerated(EnumType.STRING)
	private OfferingType type;
	@Column(nullable=false, precision=12, scale=2)
	private BigDecimal unitPrice;
	@Column(precision=5, scale=2)
	private BigDecimal discountPercentage;
	@Column(precision=12, scale=2)
	private BigDecimal discountAmmount;
	@JsonView(Views.OfferingOfferingGroup.class)
	@ManyToOne(optional=false)
	private OfferingGroup group;
	@JsonView(Views.OfferingUnitOfMeasurement.class)
	@ManyToOne(optional=false)
	private UnitOfMeasurement unitOfMeasurement;
	
	public Offering() {
	}
	public Offering(String name, OfferingType type, BigDecimal unitPrice, BigDecimal discountPercentage,
			BigDecimal discountAmmount, OfferingGroup group, UnitOfMeasurement unitOfMeasurement) {
		this.name = name;
		this.type = type;
		this.unitPrice = unitPrice;
		this.discountPercentage = discountPercentage;
		this.discountAmmount = discountAmmount;
		group.getOfferings().add(this);
		this.group = group;
		this.unitOfMeasurement = unitOfMeasurement;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public OfferingType getType() {
		return type;
	}
	public void setType(OfferingType type) {
		this.type = type;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
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
	public OfferingGroup getGroup() {
		return group;
	}
	public void setGroup(OfferingGroup group) {
		this.group = group;
	}
	public UnitOfMeasurement getUnitOfMeasurement() {
		return unitOfMeasurement;
	}
	public void setUnitOfMeasurement(UnitOfMeasurement unitOfMeasurement) {
		this.unitOfMeasurement = unitOfMeasurement;
	}
}
