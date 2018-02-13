package service.inteface;

import java.util.Collection;

import data.entity.Offering;

public interface OfferingService {
	Offering create(Offering offering);
	Offering readById(Long id);
	Collection<Offering> readAll();
}
