package com.bajddi.catalogue.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class CatalogueDao implements ICatalogueDao {
    
	private Map<String,Produit> produits = new HashMap<String, Produit>();
    Logger log= Logger.getLogger(CatalogueDao.class);
	
	
	@Override
	public void addProduit(Produit p) {
		produits.put(p.getReference(), p);
	}

	@Override
	public List<Produit> getAllProduits() {
		 
		return  new ArrayList<Produit>(produits.values());
	}

	@Override
	public List<Produit> getProduitsParMC(String mc) {
		List<Produit> prods = new ArrayList();
		for(Produit p : produits.values()) {
			if(p.getDesignation().indexOf(mc)>=0) {
				prods.add(p);
			}
		}
		return prods;
	}

	@Override
	public Produit getProduit(String ref) {	 
		return produits.get(ref);
	}

	@Override
	public void deleteProduit(String ref) {
		produits.remove(ref);
	}

	@Override
	public void updateProduit(Produit p) {
		produits.put(p.getReference(), p);
	}

	public void init() {
		log.info("Initialisation du catalogue de produits");
		addProduit(new Produit("A14ERF", "ordinateur", 120, 10));
		addProduit(new Produit("AK9871", "smartphone", 100, 9));
		addProduit(new Produit("M98BDG", "imprimante", 20, 12));
		addProduit(new Produit("L98UJH", "scanner", 15, 20));
	}
	
}
