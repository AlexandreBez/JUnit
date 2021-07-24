package atividade6;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class Asserts {

	@Test
	public void asserts() {
		
		assertEquals("Teste", "Teste");
		assertTrue(5 > 2);
		assertFalse(10 > 15);
		assertTimeout(Duration.ofMillis(1000),() -> Thread.sleep(1500));
		
		assertAll(
				() -> assertEquals("Teste", "Teste"),
				() -> assertTrue(5 > 2)
		);
		
	}
}
