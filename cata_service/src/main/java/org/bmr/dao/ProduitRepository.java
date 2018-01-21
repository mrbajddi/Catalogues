package org.bmr.dao;

import org.bmr.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@RepositoryRestResource(path = "produits")
public interface ProduitRepository extends JpaRepository<Produit, Long>{

	@RestResource(path="byDesignation")
	@Query("select p from Produit p where p.designation like '%'|| :designation ||'%' ")
	public Page<Produit> findByDesignation(@Param("designation") String designation, Pageable pageable);
}
