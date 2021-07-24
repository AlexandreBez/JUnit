package atividade8;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("execucao da Classe A")
public class MetodoNested {

	@DisplayName("metodo de teste da Classe A")
	@Test
	public void testeClasse1() {
		System.out.println("Teste classe 1");
	}
	
	@BeforeAll
	public static void setup() {
		System.out.println("BeforeAll classe 1");
	}
	
	@AfterAll
	public static void tearDown() {
		System.out.println("AfterAll classe 1");
	}
	
	@BeforeEach
	public void setupBeforeEach() {
		System.out.println("BeforeEach classe 1");
	}
	
	@AfterEach
	public void setupAfterEach() {
		System.out.println("AfterEach classe 1");
	}
	
	@Nested
	@DisplayName("Execucao da classe B")
	class Classe2 {
		
		@DisplayName("metodo de teste da Classe B")
		@Test
		public void testeClasse2() {
			System.out.println("Teste classe 2");
		}

	}
	
	@Nested
	@DisplayName("Execucao da classe C")
	class Classe3 {
		
		@DisplayName("metodo de teste da Classe C")
		@Test
		public void testeClasse3() {
			System.out.println("Teste classe 3");
		}
		
		@BeforeEach
		public void setupBeforeEach2() {
			System.out.println("BeforeEach classe 3");
		}
		
		@AfterEach
		public void setupAfterEach2() {
			System.out.println("AfterEach classe 3");
		}


	}
}
