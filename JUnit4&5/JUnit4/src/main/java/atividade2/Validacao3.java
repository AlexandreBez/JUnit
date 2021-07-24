package atividade2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class Validacao3 {
	
	String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};

	@Test
	public void validacaoNull() {
		
		String valor = null;
		
		assertNull(valor);
		
		System.out.println("Valida null");

	}
	
	@Test
	public void validacaoNotNull() {
		
		String valor = "Teste";
		
		assertNotNull(valor);
		
		System.out.println("Valida Not Null");

	}
	
	@Test
	public void validacaoArray() {
		
		assertArrayEquals(cars, cars1);
		
		System.out.println("Valida Array");

	}
}
