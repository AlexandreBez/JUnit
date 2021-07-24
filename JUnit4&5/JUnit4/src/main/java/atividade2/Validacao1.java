package atividade2;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import atividade4.IRegressivo;
import atividade4.ISmoke;

public class Validacao1 {
	
	@Category(ISmoke.class)
	@Test
	public void validaTrue() {
		
		String texto = "valor";
		boolean status = true;
		
		//assert True
		
		assertTrue("Validacao True",status);
		assertTrue(texto.contains("valor"));
		assertTrue(texto.equalsIgnoreCase("valor"));
		
		System.out.println("Valida True");

	}
	
	@Category(IRegressivo.class)
	@Test
	public void validaFalse() {
		
		boolean status = false;
		
		assertFalse("Validacao False",status);
		
		System.out.println("Valida False");

	}
}
