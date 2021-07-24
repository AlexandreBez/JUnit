package atividade1;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import atividade4.IRegressivo;
import atividade4.ISmoke;

public class Atividade1 {
	
	@Category(IRegressivo.class)
	@Test
	public void metodoTeste1() {
		System.out.println("Execucao do teste1");
	}
	
	@Category(ISmoke.class)
	@Test
	public void metodoTeste2() {
		System.out.println("Execucao do teste2");
	}
	
	public void metodoSemTeste() {
		System.out.println("Execusao sem @Test");
	}
}
