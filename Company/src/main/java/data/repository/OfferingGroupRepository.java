package data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import data.entity.OfferingGroup;

@Repository
public interface OfferingGroupRepository extends JpaRepository<OfferingGroup, Integer> {

}
