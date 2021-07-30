package introducao;

import junit.framework.TestCase;

public class SomaTest2 extends TestCase {
		
	
	Soma ex1 = new Soma();
	
	
	
	public void testSomar() {
		int somatorio = ex1.somar(10,10);
		
		assertEquals(20, somatorio);
	}

}
