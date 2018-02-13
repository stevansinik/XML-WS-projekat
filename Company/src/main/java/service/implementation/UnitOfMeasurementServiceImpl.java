package service.implementation;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.entity.UnitOfMeasurement;
import data.repository.UnitOfMeasurementRepository;
import service.inteface.UnitOfMeasurementService;

@Service
public class UnitOfMeasurementServiceImpl implements UnitOfMeasurementService {

	@Autowired
	private UnitOfMeasurementRepository unitOfMeasurementRepo;
	
	@Override
	public UnitOfMeasurement create(UnitOfMeasurement unitOfMeasurement) {
		UnitOfMeasurement savedUnitOfMeasurement = 
			unitOfMeasurementRepo.save(unitOfMeasurement);
		return savedUnitOfMeasurement;
	}

	@Override
	public UnitOfMeasurement readById(Integer id) {
		UnitOfMeasurement readUnitOfMeasurement = 
			unitOfMeasurementRepo.getOne(id);
		return readUnitOfMeasurement;
	}

	@Override
	public Collection<UnitOfMeasurement> readAll() {
		Collection<UnitOfMeasurement> allUnitsOfMeasurement = 
			unitOfMeasurementRepo.findAll();
		return allUnitsOfMeasurement;
	}

}
