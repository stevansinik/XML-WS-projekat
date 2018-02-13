package service.implementation;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.entity.OfferingGroup;
import data.repository.OfferingGroupRepository;
import service.inteface.OfferingGroupService;

@Service
public class OfferingGroupServiceImpl implements OfferingGroupService {

	@Autowired
	private OfferingGroupRepository offeringGroupRepo;
	
	@Override
	public OfferingGroup create(OfferingGroup offeringGroup) { 
		OfferingGroup savedOfferingGroup = offeringGroupRepo.save(offeringGroup);
		return savedOfferingGroup;
	}

	@Override
	public OfferingGroup readById(Integer id) {
		OfferingGroup readOfferingGroup = offeringGroupRepo.getOne(id);
		return readOfferingGroup;
	}

	@Override
	public Collection<OfferingGroup> readAll() {
		Collection<OfferingGroup> allOfferingGroups = offeringGroupRepo.findAll();
		return allOfferingGroups;
	}

}
