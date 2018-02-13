package data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import data.entity.UnitOfMeasurement;

@Repository
public interface UnitOfMeasurementRepository extends JpaRepository<UnitOfMeasurement, Integer> {
}

