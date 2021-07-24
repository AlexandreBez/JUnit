package atividade7;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@SuppressWarnings("deprecation")
//@TestMethodOrder(MethodOrderer.Alphanumeric.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
@TestMethodOrder(MethodOrderer.Random.class)

public class Ordenacao {

	@Order(2)
	@Test
	public void teste1() {
		System.out.println("Teste 1");
	}
	
	@Order(1)
	@Test
	public void teste2() {
		System.out.println("Teste 2");
	}

	@Order(3)
	@Test
	public void teste3() {
		System.out.println("Teste 3");
	}

}
