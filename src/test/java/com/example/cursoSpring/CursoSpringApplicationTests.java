package com.example.cursoSpring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.example.cursoSpring.entities.Product;
import com.example.cursoSpring.repositoires.ProductRepository;

@SpringBootTest
@ActiveProfiles("test")
class CursoSpringApplicationTests {

	@Autowired
	private ProductRepository productRepository;
	
	@Test
	void contextLoads() {
	}

	@Test
	void teste() {
		
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, ""); 
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, ""); 
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, ""); 
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, ""); 
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
		
		List<Product> teste = productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		
		assertEquals("The Lord of the Rings", teste.get(0).getName());
		assertEquals("Smart TV", teste.get(1).getName());
		assertEquals("Macbook Pro", teste.get(2).getName());
		assertEquals("PC Gamer", teste.get(3).getName());
		assertEquals("Rails for Dummies", teste.get(4).getName());
		
	}
	
}
