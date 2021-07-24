package atividade5;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;

public class RepeteTeste {

	@Tag("Teste1")
	@RepeatedTest(5)
	public void repeticaoTeste() {
		System.out.println("teste");
	}
	
	@Tag("Teste2")
	@RepeatedTest(value = 3, name = "Repeticao de teste: {currentRepetition}/{totalRepetitions}")
	public void repeticaoTeste2() {
		System.out.println("teste");
	}
}
