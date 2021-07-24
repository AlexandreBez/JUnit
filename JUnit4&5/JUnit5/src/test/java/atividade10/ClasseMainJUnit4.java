package atividade10;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ClasseMainJUnit4 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("junit4 executado");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("junit4 executado");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("junit4 executado");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("junit4 executado");
	}

	@Test
	public void test() {
		System.out.println("junit4 executado");
	}

}
