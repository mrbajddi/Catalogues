package com.bajddi.catalogue.metier;

import java.util.List;

import com.bajddi.catalogue.dao.ICatalogueDao;
import com.bajddi.catalogue.dao.Produit;

public class CatalogueMetierImpl implements ICatalogueMetier {

	ICatalogueDao dao;
	
	public void setDao(ICatalogueDao dao) {
		this.dao = dao;
	}

	@Override
	public void addProduit(Produit p) {
		dao.addProduit(p);
	}

	@Override
	public List<Produit> getAllProduits() {
		return dao.getAllProduits();
	}

	@Override
	public List<Produit> getProduitsParMC(String mc) {
		return dao.getProduitsParMC(mc);
	}

	@Override
	public Produit getProduit(String ref) {
		return dao.getProduit(ref);
	}

	@Override
	public void deleteProduit(String ref) {
	  dao.deleteProduit(ref);
	}

	@Override
	public void updateProduit(Produit p) {
		dao.updateProduit(p);  
	}

}
