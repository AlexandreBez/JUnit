package atividade2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class Validacao2 {

	@Test
	public void validarIgualdade() {
		
		assertEquals("Mensagem de Igualdade", "azul", "azul");
	}
	
	@Test
	public void validarNaoIgualdade() {
		
		assertNotEquals("Mensagem de Igualdade", "azul1", "azul");
	}
}

