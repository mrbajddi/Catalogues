package org.bmr.dao;

import java.util.List;

import org.bmr.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class ProduitRestService {

	@Autowired
	ProduitRepository produitRepository;
	
	@RequestMapping(value="/produits",method=RequestMethod.GET)
	public List<Produit> listProduit(){
		return produitRepository.findAll();
	}
	
	@RequestMapping(value="/produits/{id}",method=RequestMethod.GET)
	public Produit getProduit(@PathVariable("id") Long id){
		return produitRepository.findOne(id);
	}
	
	@RequestMapping(value="/produits",method=RequestMethod.POST)
	public Produit save(@RequestBody Produit p){
		return produitRepository.save(p);
	}
	
	@RequestMapping(value="/produits/{id}",method=RequestMethod.PUT)
	public Produit update(@RequestBody Produit p,@PathVariable("id") Long id){
		p.setId(id);
		return produitRepository.saveAndFlush(p);
	}
	
	@RequestMapping(value="/produits/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id){
		produitRepository.delete(id);
	}
	
}
