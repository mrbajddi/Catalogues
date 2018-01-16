package com.bajddi.catalogue.dao;

import java.util.List;

public interface ICatalogueDao {

	public void addProduit(Produit p);
	public List<Produit> getAllProduits();
	public List<Produit> getProduitsParMC(String mc);
	public Produit getProduit(String ref);
	public void deleteProduit(String ref);
	public void updateProduit(Produit p);
	
}
