package com.bajddi.catalogue.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bajddi.catalogue.dao.Produit;
import com.bajddi.catalogue.metier.ICatalogueMetier;

@Controller
public class CatalogueController {
    @Autowired
	private ICatalogueMetier metier;
	
    @RequestMapping(value="/index")
    public String index(Model model) {
    	model.addAttribute("produit", new Produit());
    	model.addAttribute("produits", metier.getAllProduits());
    	return "produits";   	
    }
	
    @RequestMapping(value="/saveProduit")
    public String save(@Valid Produit p, BindingResult binding ,Model model) {
    	if(binding.hasErrors()) {
        	model.addAttribute("produits", metier.getAllProduits());
    		return "produits";
    	}
    	metier.addProduit(p);
    	model.addAttribute("produit", new Produit());
    	model.addAttribute("produits", metier.getAllProduits());
    	return "produits";   	
    }
    
	
}
