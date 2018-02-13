package service.inteface;

import java.util.Collection;

import data.entity.UnitOfMeasurement;

public interface UnitOfMeasurementService {
	UnitOfMeasurement create(UnitOfMeasurement unitOfMeasurement);
	UnitOfMeasurement readById(Integer id);
	Collection<UnitOfMeasurement> readAll();
}
