package atividade7;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrdenarMetodos {
	
	@Test
	public void teste1() {
		System.out.println("Teste 1");
	}
	
	@Test
	public void teste3() {
		System.out.println("Teste 3");
	}
	
	@Test
	public void teste2() {
		System.out.println("Teste 2");
	}
	
}
