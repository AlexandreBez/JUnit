package atividade5;

import org.junit.Ignore;
import org.junit.Test;

public class TestIgnore {

	@Test
	public void testeMetodo() {
		System.out.println("teste 1");
	}
	
	@Ignore(value = "teste ignorado com sucesso")
	@Test
	public void testeIgnorado() {
		System.out.println("Teste ignorado");
	}
	
	@Test
	public void testeMetodo2() {
		System.out.println("teste 2");
	}
}
