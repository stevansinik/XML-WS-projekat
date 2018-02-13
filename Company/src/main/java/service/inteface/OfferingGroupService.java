package service.inteface;

import java.util.Collection;

import data.entity.Currency;
import data.entity.OfferingGroup;

public interface OfferingGroupService {
	OfferingGroup create(OfferingGroup offeringGroup);
	OfferingGroup readById(Integer id);
	Collection<OfferingGroup> readAll();
}
