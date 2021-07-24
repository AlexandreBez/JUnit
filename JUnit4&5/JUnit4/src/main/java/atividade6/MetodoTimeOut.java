package atividade6;

import static org.junit.Assert.assertFalse;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MetodoTimeOut {
	
	@Rule public Timeout timeGlobal = Timeout.seconds(1);

	@Test(timeout = 1000)
	public void testeTime() {
		
		assertFalse(false);
	
	}
	
	@Test(timeout = 1000)
	public void testeTimeFalha() throws InterruptedException{
		
		Thread.sleep(1050);
	
	}
	
	@Test(timeout = 1000)
	public void testeTimeSucesso() throws InterruptedException{
		
		System.out.println("Sucesso");
	
	}
}
