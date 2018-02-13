package data.repository;

import javax.persistence.QueryHint;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import data.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {
	@EntityGraph(value = "graph.Company.allOfferings", type = EntityGraphType.FETCH)
	Company readById(Integer id);
}

