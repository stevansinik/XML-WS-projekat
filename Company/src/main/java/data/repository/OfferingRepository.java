package data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import data.entity.Offering;

@Repository
public interface OfferingRepository extends JpaRepository<Offering, Long> {

}
