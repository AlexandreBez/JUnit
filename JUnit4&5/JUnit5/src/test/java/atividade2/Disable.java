package atividade2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Disable{
	
	@Test
	public void metodoTeste1() {
		System.out.println("Teste 1");
	}
	
	@Disabled("Nao ira rodar")
	@Test
	public void metodoTeste2() {
		System.out.println("Teste 2");
	}
	
	@Test
	public void metodoTeste3() {
		System.out.println("Teste 3");
	}
}
