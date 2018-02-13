package service.implementation;

import java.math.BigDecimal;
import java.util.HashSet;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import data.entity.Company;
import data.entity.Currency;
import data.entity.Employee;
import data.entity.Offering;
import data.entity.OfferingGroup;
import data.entity.OfferingType;
import data.entity.UnitOfMeasurement;
import service.inteface.CompanyService;
import service.inteface.CurrencyService;
import service.inteface.EmployeeService;
import service.inteface.OfferingGroupService;
import service.inteface.OfferingService;
import service.inteface.UnitOfMeasurementService;

@Service
public class InitializationServiceImpl {
	
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
	
	@PostConstruct
	@Transactional
	public void initializeApplicationData() {
		// Currencies
		Currency dinar = currencyService.create(new Currency("RSD"));
		Currency mark = currencyService.create(new Currency("BAM"));
		Currency euro = currencyService.create(new Currency("EUR"));
		Currency dollar = currencyService.create(new Currency("USD"));
		
		// Units of measurement
		UnitOfMeasurement komad = unitOfMeasurementService.create(
				new UnitOfMeasurement("komad")
		);
		UnitOfMeasurement kg = unitOfMeasurementService.create(
				new UnitOfMeasurement("kg")
		);
		UnitOfMeasurement metar = unitOfMeasurementService.create(
				new UnitOfMeasurement("m")
		);
		UnitOfMeasurement metarKvadratni = unitOfMeasurementService.create(
				new UnitOfMeasurement("m2")
		);
		
		// Companies
		Company companyA = companyService.create(new Company(
				"Firma A", 
				"Ulica A, Grad A, Drzava A", 
				"10000001",
				dinar)
		);
		Company companyB = companyService.create(new Company(
				"Firma B", 
				"Ulica B, Grad B, Drzava B", 
				"10000002",
				mark)
		);
		Company companyC = companyService.create(new Company(
				"Firma C", 
				"Ulica C, Grad C, Drzava C", 
				"10000003",
				euro)
		);
		Company companyD = companyService.create(new Company(
				"Firma D", 
				"Ulica D, Grad D, Drzava D", 
				"10000004",
				dollar)
		);
		
		// Employees		
		String password = "topsecret";
		Employee pero = employeeService.create(new Employee("pero", password, companyA));
		Employee jovo = employeeService.create(new Employee("jovo", password, companyA));
		Employee miko = employeeService.create(new Employee("miko", password, companyB));
		Employee ziko = employeeService.create(new Employee("ziko", password, companyB));
		Employee lazo = employeeService.create(new Employee("lazo", password, companyC));
		Employee miki = employeeService.create(new Employee("miki", password, companyC));
		Employee nidzo = employeeService.create(new Employee("nidzo", password, companyD));
		Employee stevo = employeeService.create(new Employee("stevo", password, companyD));
		Employee danilo = employeeService.create(new Employee("danilo", password, companyD));
		
		// Offering groups
		OfferingGroup elektromaterijal = offeringGroupService.create(new OfferingGroup(
				"Elektromaterijal",
				new BigDecimal("12.0"),
				new BigDecimal("5.0"),
				null,
				companyA)
		);
		OfferingGroup sanitarije = offeringGroupService.create(new OfferingGroup(
				"Sanitarije",
				new BigDecimal("13.0"),
				null,
				null,
				companyA)
		);
		OfferingGroup prehana = offeringGroupService.create(new OfferingGroup(
				"Prehrana",
				new BigDecimal("14.0"),
				null,
				null,
				companyB)
		);
		OfferingGroup skolskiPribor = offeringGroupService.create(new OfferingGroup(
				"Skolski Pribor",
				new BigDecimal("13.0"),
				new BigDecimal("10.0"),
				null,
				companyB)
		);
		OfferingGroup polovniAutomobili = offeringGroupService.create(new OfferingGroup(
				"Polovni Automobili",
				new BigDecimal("15.0"),
				null,
				new BigDecimal("1000.0"),
				companyC)
		);
		OfferingGroup noviAutomobili = offeringGroupService.create(new OfferingGroup(
				"Novi Automobili",
				new BigDecimal("14.0"),
				null,
				null,
				companyC)
		);
		OfferingGroup autodijelovi = offeringGroupService.create(new OfferingGroup(
				"Autodijelovi",
				new BigDecimal("15.0"),
				null,
				null,
				companyC)
		);
		OfferingGroup proizvodiNaBaziCementa = offeringGroupService.create(new OfferingGroup(
				"Proizvodi Na Bazi Cementa",
				new BigDecimal("13.0"),
				null,
				null,
				companyD)
		);
		OfferingGroup celicniProizvodi = offeringGroupService.create(new OfferingGroup(
				"Celicni Proizvodi",
				new BigDecimal("14.0"),
				new BigDecimal("10.0"),
				null,
				companyD)
		);
		OfferingGroup izolacioniMaterijali = offeringGroupService.create(new OfferingGroup(
				"Izolacioni Materijali",
				new BigDecimal("16.0"),
				null,
				null,
				companyD)
		);
		OfferingGroup alati = offeringGroupService.create(new OfferingGroup(
				"Alati",
				new BigDecimal("14.0"),
				new BigDecimal("10.0"),
				null,
				companyD)
		);
		
		//Offerings
		Offering kabelEPG = offeringService.create(new Offering(
				"Kabel EPG", 
				OfferingType.Product, 
				new BigDecimal("85.00"),
				null,
				null,
				elektromaterijal,
				metar)
		);
		Offering montaznaPloca = offeringService.create(new Offering(
				"Montazna Ploca 1/4", 
				OfferingType.Product, 
				new BigDecimal("903.94"),
				null,
				null,
				elektromaterijal,
				komad)
		);
		Offering zastitniPrekidac = offeringService.create(new Offering(
				"Zastitni Prekidac", 
				OfferingType.Product, 
				new BigDecimal("4376.00"),
				null,
				new BigDecimal("40.00"),
				elektromaterijal,
				komad)
		);
		Offering tusCrijevo = offeringService.create(new Offering(
				"Tus Crijevo", 
				OfferingType.Product, 
				new BigDecimal("600.00"),
				null,
				null,
				sanitarije,
				metar)
		);
		Offering bojler = offeringService.create(new Offering(
				"Niskomontazni Bojler", 
				OfferingType.Product, 
				new BigDecimal("5000.00"),
				null,
				new BigDecimal("1500.00"),
				sanitarije,
				komad)
		);
		Offering kada = offeringService.create(new Offering(
				"Kada Sa Vratima", 
				OfferingType.Product, 
				new BigDecimal("120000.00"),
				null,
				new BigDecimal("25000.00"),
				sanitarije,
				komad)
		);
		Offering hljeb = offeringService.create(new Offering(
				"Hljeb bijeli rezani", 
				OfferingType.Product, 
				new BigDecimal("0.80"),
				null,
				null,
				prehana,
				komad)
		);
		Offering jabuka = offeringService.create(new Offering(
				"Jabuka Svjeza", 
				OfferingType.Product, 
				new BigDecimal("1.20"),
				null,
				null,
				prehana,
				kg)
		);
		Offering jaja = offeringService.create(new Offering(
				"Jaja svjeza", 
				OfferingType.Product, 
				new BigDecimal("0.20"),
				null,
				null,
				prehana,
				komad)
		);
		Offering hemijskaOlovka = offeringService.create(new Offering(
				"Hemijska olovka", 
				OfferingType.Product, 
				new BigDecimal("1.00"),
				null,
				null,
				skolskiPribor,
				komad)
		);
		Offering gumica = offeringService.create(new Offering(
				"Gumica za brisanje", 
				OfferingType.Product, 
				new BigDecimal("1.50"),
				null,
				null,
				skolskiPribor,
				komad)
		);
		Offering suvaOlovka = offeringService.create(new Offering(
				"Suva olovka", 
				OfferingType.Product, 
				new BigDecimal("0.50"),
				null,
				null,
				skolskiPribor,
				komad)
		);
		Offering polo = offeringService.create(new Offering(
				"Volkswagen Polo 1.2 Trend Line", 
				OfferingType.Product, 
				new BigDecimal("5590.00"),
				null,
				null,
				polovniAutomobili,
				komad)
		);
		Offering renoSenik = offeringService.create(new Offering(
				"Renault Scenic", 
				OfferingType.Product, 
				new BigDecimal("7999.00"),
				new BigDecimal("10.00"),
				null,
				polovniAutomobili,
				komad)
		);
		Offering pezo = offeringService.create(new Offering(
				"Peugeot 508", 
				OfferingType.Product, 
				new BigDecimal("8490.00"),
				null,
				null,
				polovniAutomobili,
				komad)
		);
		Offering mazda = offeringService.create(new Offering(
				"Mazda 2 G90 Takumi", 
				OfferingType.Product, 
				new BigDecimal("15060.00"),
				new BigDecimal("15.00"),
				null,
				noviAutomobili,
				komad)
		);
		Offering dacia = offeringService.create(new Offering(
				"Dacia Sandero StepWay", 
				OfferingType.Product, 
				new BigDecimal("10055.00"),
				null,
				new BigDecimal("1000.00"),
				noviAutomobili,
				komad)
		);
		Offering renoMegan = offeringService.create(new Offering(
				"Renault Megane Intens Energy", 
				OfferingType.Product, 
				new BigDecimal("18990.00"),
				null,
				null,
				noviAutomobili,
				komad)
		);
		Offering klip = offeringService.create(new Offering(
				"Klip", 
				OfferingType.Product, 
				new BigDecimal("100.00"),
				new BigDecimal("10.00"),
				null,
				autodijelovi,
				komad)
		);
		Offering bregastaOsovina = offeringService.create(new Offering(
				"Bregasta Osovina", 
				OfferingType.Product, 
				new BigDecimal("150.00"),
				null,
				new BigDecimal("30.00"),
				autodijelovi,
				komad)
		);
		Offering glavaMotora = offeringService.create(new Offering(
				"Glava Motora", 
				OfferingType.Product, 
				new BigDecimal("500.00"),
				null,
				null,
				autodijelovi,
				komad)
		);
		Offering titanBijeliCement = offeringService.create(new Offering(
				"Titan Bijeli Cement", 
				OfferingType.Product, 
				new BigDecimal("0.50"),
				null,
				null,
				proizvodiNaBaziCementa,
				kg)
		);
		Offering brzovezujuciCement = offeringService.create(new Offering(
				"Brzovezujuci Cement", 
				OfferingType.Product, 
				new BigDecimal("1.00"),
				null,
				null,
				proizvodiNaBaziCementa,
				kg)
		);
		Offering lijepakCement = offeringService.create(new Offering(
				"Lijepak na bazi cementa", 
				OfferingType.Product, 
				new BigDecimal("1.50"),
				null,
				null,
				proizvodiNaBaziCementa,
				kg)
		);
		Offering offering = offeringService.create(new Offering(
				"Armaturna Mreza Q", 
				OfferingType.Product, 
				new BigDecimal("30.00"),
				null,
				null,
				celicniProizvodi,
				komad)
		);
		Offering gradjevinskiEkseri = offeringService.create(new Offering(
				"Gradjevinski Ekseri 2.8 * 55 mm", 
				OfferingType.Product, 
				new BigDecimal("2.00"),
				null,
				null,
				celicniProizvodi,
				kg)
		);
		Offering paljenaArmirackaZica = offeringService.create(new Offering(
				"Paljena Armiracka Zica", 
				OfferingType.Product, 
				new BigDecimal("2.50"),
				null,
				null,
				celicniProizvodi,
				metar)
		);
		Offering kamenaMineralnaVuna = offeringService.create(new Offering(
				"Kamena mineralna vuna", 
				OfferingType.Product, 
				new BigDecimal("4.50"),
				null,
				null,
				izolacioniMaterijali,
				metarKvadratni)
		);
		Offering bitumenskeTrake = offeringService.create(new Offering(
				"Bitumenska Trake", 
				OfferingType.Product, 
				new BigDecimal("20.00"),
				null,
				null,
				izolacioniMaterijali,
				komad)
		);
		Offering paropropusnaKrovnaFolija = offeringService.create(new Offering(
				"Paropropusna Krovna Folija", 
				OfferingType.Product, 
				new BigDecimal("1.20"),
				null,
				null,
				izolacioniMaterijali,
				metarKvadratni)
		);
		Offering busilicaUdarna = offeringService.create(new Offering(
				"Busilica Udarna", 
				OfferingType.Product, 
				new BigDecimal("60.00"),
				null,
				null,
				alati,
				komad)
		);
		Offering aparatZaVarenje = offeringService.create(new Offering(
				"Aparat Za Varenje", 
				OfferingType.Product, 
				new BigDecimal("280.00"),
				null,
				new BigDecimal("20.00"),
				alati,
				komad)
		);
		Offering masinskiCekic = offeringService.create(new Offering(
				"Masinski Cekic", 
				OfferingType.Product, 
				new BigDecimal("5.00"),
				null,
				null,
				alati,
				komad)
		);
	}
	
}
