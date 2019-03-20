package practica4;

import static org.junit.Assert.*;

import org.junit.Test;

public class AritmeticaTest {

	@Test
	public void testSuma() {
		System.out.println("Suma:");
		Aritmetica S= new Aritmetica(2,3);
		assertTrue(S.suma()==5);
	}

	@Test
	public void testResta() {
		System.out.println("Resta:");
		Aritmetica R=new Aritmetica(5,3);
		assertTrue(R.resta()==2);
	}

	@Test
	public void testMultiplicacion() {
		System.out.println("Multiplicar:");
		Aritmetica M= new Aritmetica(5,2);
		assertTrue(M.multiplicacion() == 10);
	}

	@Test
	public void testDivision() {
		System.out.println("Dividri:");
		Aritmetica D= new Aritmetica(6,2);
		assertTrue(D.division() == 3);
	}

}
