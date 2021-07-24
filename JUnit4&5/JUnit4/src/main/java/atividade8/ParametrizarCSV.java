package atividade8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;

@RunWith(JUnitParamsRunner.class)
public class ParametrizarCSV {

	@Test
	@FileParameters(value =  "src/test/java/atividade8/dados.csv", mapper = CsvWithHeaderMapper.class)
	public void validarTestes(String nome, double peso, double altura, String resultado) {
		System.out.println(validarIMC(nome, peso, altura));
		assertEquals(resultado, validarIMC(nome, peso, altura));
	}
	
	public String validarIMC(String nome, double peso, double altura) {

		String retorno = null;
		double resultado = peso / altura;

		if (resultado < 16) {
			retorno = nome + " Baixo peso muito grave";

		} else if (resultado >= 16 && resultado <= 16.99) {
			retorno = nome + " Baixo peso grave";

		} else if (resultado >= 17 && resultado <= 18.49) {
			retorno = nome + " Baixo peso";

		} else if (resultado >= 18.50 && resultado <= 24.99) {
			retorno = nome + " Peso normal";

		} else if (resultado >= 25 && resultado <= 29.99) {
			retorno = nome + " Sobrepeso";

		} else if (resultado >= 30 && resultado <= 34.99) {
			retorno = nome + " Obesidade grau I";
		} else if (resultado >= 35 && resultado <= 39.99) {
			retorno = nome + " Obesidade grau II";
		} else if (resultado >= 40) {
			retorno = nome + " Obesidade grau III";
		}
		return retorno;
	}
}
