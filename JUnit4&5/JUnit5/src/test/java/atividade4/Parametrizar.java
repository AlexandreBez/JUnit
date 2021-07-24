package atividade4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Parametrizar {
	
	enum ListaNomes{Maria, Jose, Carlos, Paulo}

	@ParameterizedTest
	@ValueSource(strings = {"Teste 1", "Teste 2"})
	public void testeParametrizado(String texto) {
		assertNotNull(texto);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1, 2, 3, 4, 5})
	public void testeNumeros(int valor) {
		assertTrue(valor > 0 && valor < 10);
	}
	
	@ParameterizedTest(name = "Numeros Validados {index}: {0}")
	@ValueSource(ints = {1, 2, 3, 4, 5})
	public void testeNumeros2(int valor) {
		assertTrue(valor > 0 && valor < 10);
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "/atividade4/nomes.csv")
	public void nomes(String nome) {
		System.out.println(nome);
	}
	
	@ParameterizedTest
	@EnumSource(ListaNomes.class)
	public void nomes2(ListaNomes nome2) {
		System.out.println(nome2);
	}
	
	@ParameterizedTest
	@NullSource
	@ValueSource(strings = {""})
	public void nomesNull(String valores) {
		System.out.println(valores);
	}

	@ParameterizedTest
	@CsvSource({"java, 4", "junit, 5"})
	public void nomesCSVSource(String texto, int numero) {
		System.out.println(texto);
		System.out.println(numero);
		assertEquals(numero, texto.length());
	}

}

