package atividade1;

import org.junit.Test;

public class NaoPermite {
	
	@Test
	public String metodoNaoPermite1() {
		return null;
	}
	
	@Test
	public Double metodoNaoPermite2() {
		return null;
	}
	
	@Test
	protected void metodoNaoPermite3() {
//		return null;
	}
	
	@Test
	private void metodoNaoPermite4() {
//		return null;
	}
	
}
