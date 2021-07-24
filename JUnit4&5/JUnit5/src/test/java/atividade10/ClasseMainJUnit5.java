package atividade10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClasseMainJUnit5 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("junit 5 executado");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("junit 5 executado");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("junit 5 executado");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("junit 5 executado");
	}

	@Test
	void test() {
		System.out.println("junit 5 executado");
	}

}
