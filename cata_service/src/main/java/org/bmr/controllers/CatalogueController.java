package org.bmr.controllers;

import java.util.List;

import javax.jws.WebParam;

import org.bmr.dao.ProduitRepository;
import org.bmr.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogueController {
	
	@Autowired
	ProduitRepository produitRepository;
	
	@RequestMapping(value="/test")
	public String test(){
		return "test";
	}
	
	@RequestMapping(value="/save")
	public Produit save(@RequestBody Produit p){
		produitRepository.save(p);
		return p;
	}
	
	@RequestMapping(value="/all")
	public List<Produit> getProduits(){
		return produitRepository.findAll();
	}
	
	@RequestMapping(value="/produitsPage")
	public Page<Produit> getProduitsPage(@WebParam int page,@WebParam int size){
		return produitRepository.findAll(new PageRequest(page, size));
	}
	

}
