package com.bajddi.catalogue.metier;

import java.util.List;

import com.bajddi.catalogue.dao.Produit;

public interface ICatalogueMetier {
	public void addProduit(Produit p);
	public List<Produit> getAllProduits();
	public List<Produit> getProduitsParMC(String mc);
	public Produit getProduit(String ref);
	public void deleteProduit(String ref);
	public void updateProduit(Produit p);
}
