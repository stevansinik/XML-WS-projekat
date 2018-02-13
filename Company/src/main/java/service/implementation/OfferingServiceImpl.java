package service.implementation;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.entity.Offering;
import data.repository.OfferingRepository;
import service.inteface.OfferingService;

@Service
public class OfferingServiceImpl implements OfferingService {

	@Autowired
	private OfferingRepository offeringRepo;
	
	@Override
	public Offering create(Offering offering) {
		Offering savedOffering = offeringRepo.save(offering);
		return savedOffering;
	}

	@Override
	public Offering readById(Long id) {
		Offering readOffering = offeringRepo.getOne(id);
		return readOffering;
	}

	@Override
	public Collection<Offering> readAll() {
		Collection<Offering> allOfferings = offeringRepo.findAll();
		return allOfferings;
	}

}
