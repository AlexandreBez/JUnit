package atividade3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PrePosCondcao {
	
	@BeforeClass
	public static void metodoBeforeClass() {
		System.out.println("Metodo de Pre @BeforeClass");
	}
	
	@Before
	public void metodoPre() {
		System.out.println("Metodo de Pre @Before");
	}
	
	@Test
	public void metodoTest() {
		System.out.println("teste 1");
	}
	
	@After
	public void metodoAfter() {
		System.out.println("Metodo de Pos @After");
	}
	
	@AfterClass
	public static void metodoAfterClass() {
		System.out.println("Metodo de Pos @AfterClass");
	}
}
