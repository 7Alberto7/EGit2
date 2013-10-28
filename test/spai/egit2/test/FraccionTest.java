package spai.egit2.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import spai.egit2.Fraccion;

public class FraccionTest {
	private Fraccion fraccion;

	@Before
	public void initObjects() {
		this.fraccion = new Fraccion(2, 3);
	}

	@Test
	public void testcontructorIntInt() {
		assertEquals(2, this.fraccion.getNumerador());
		assertEquals(3, this.fraccion.getDenominador());
	}

	@Test
	public void testConstructorSinParametros() {
		Fraccion fraccion = new Fraccion();
		assertEquals(1, fraccion.getNumerador());
		assertEquals(1, fraccion.getDenominador());
	}

	@Test
	public void testSetNumerador() {
		this.fraccion.setNumerador(4);
		assertEquals(4, fraccion.getNumerador());
	}

	@Test
	public void testSetDenominador() {
		this.fraccion.setDenominador(4);
		assertEquals(4, fraccion.getDenominador());
	}

	@Test
	public void testDecimal() {
		assertEquals(2.0 / 3.0, fraccion.decimal(), 1e-10);
	}

	@Test
	public void testIsImpropia() {
		assertEquals( ((fraccion.getNumerador() / fraccion.getDenominador()) > 1),
				fraccion.isImpropia());
	}

	@Test
	public void testAreEquivalents() {

		Fraccion fraccion1 = new Fraccion(2, 4);
		Fraccion fraccion2 = new Fraccion(4, 8);
		
		assertEquals(
				(fraccion1.getNumerador() * fraccion2.getDenominador()) == 
				(fraccion1.getDenominador() * fraccion2.getNumerador()) , 
				Fraccion.areEquivalents(fraccion1,fraccion2));
	}
	
	@Test
	public void testMultiplicarFracciones(){
		Fraccion fraccion1 = new Fraccion(3,7);
		Fraccion fraccion2 = new Fraccion(4,9);
		Fraccion fraccion3 = Fraccion.multiplicarFracciones(fraccion1, fraccion2);
		
		assertTrue(( (fraccion1.getNumerador() * fraccion2.getNumerador()) == fraccion3.getNumerador()) &&
				   ( (fraccion1.getDenominador()*fraccion2.getDenominador()== fraccion3.getDenominador()) ) );
		
	}
	

}
