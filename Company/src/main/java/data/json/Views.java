package data.json;

public class Views {
	public static interface OfferingGroupCompany {};
	public static interface OfferingGroupOfferings {};
	
	public static interface OfferingOfferingGroup {};
	public static interface OfferingUnitOfMeasurement {};
	
	public static interface CompanyWithAllOfferings extends OfferingGroupOfferings, OfferingUnitOfMeasurement
	{}
}
