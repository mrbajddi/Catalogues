package org.bmr;

import org.bmr.dao.ProduitRepository;
import org.bmr.entities.Produit;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CataServiceApplication.class)
@WebAppConfiguration
public class CataServiceApplicationTests {
 
	@Autowired
	ProduitRepository produitRepository;
		
	
	@Before
	public void before(){
		
	}
	
	@Test
	public void testfindByDesignation() {
		RestTemplate restTemplate=new RestTemplate();
		produitRepository.save(new Produit("DESI01", 40, 9));
		String url ="http://localhost:8080/produits/search/byDesignation?designation=DESI01&page=0&size=1";
		//String url ="http://localhost:8080/produits";
		ResponseEntity<String> response =	restTemplate.getForEntity(url, String.class);
		System.out.println(response);
	}
	

}
