package atividade1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrePosCondicao {

	@Test
	public void metodoTeste() {
		System.out.println("Teste 1");
	}
	
	@BeforeAll
	public static void metodoBeforeAll() {
		System.out.println("Teste BeforeAll");
	}
	
	@BeforeEach
	public void metodoBeforeEach() {
		System.out.println("Teste BeforeEach");
	}
	
	@AfterAll
	public static void metodoAfterAll() {
		System.out.println("Teste AfterAll");
	}
	
	@AfterEach
	public void metodoAfterEach() {
		System.out.println("Teste AfterEach");
	}
	

	
}
