package org.bmr;

import org.bmr.dao.ProduitRepository;
import org.bmr.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@SpringBootApplication
public class CataServiceApplication implements CommandLineRunner{

	@Autowired
	ProduitRepository produitRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CataServiceApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		 
	    produitRepository.save(new Produit("HX 524", 50, 4));
	    produitRepository.save(new Produit("PX 994", 76, 12));
	    produitRepository.save(new Produit("KK 087", 98, 54));
	    produitRepository.save(new Produit("UH 934", 7, 4));
	    produitRepository.save(new Produit("KO 932", 40, 9));
	    produitRepository.save(new Produit("DESI00", 40, 9));
	    produitRepository.flush();
	    
	    Page<Produit>  products =  produitRepository.findByDesignation("%HX%", new PageRequest(0, 5));
	    products.forEach(p->System.out.println("designation : " + p.getDesignation() + " / "+ p.getPrix()));

	}
}
