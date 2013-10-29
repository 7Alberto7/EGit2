package spai.egit2;

/**
 * Conceptos: Las fracciones propias son aquellas cuyo numerador es menor que el
 * denominador
 * 
 * Las fracciones impropias son aquellas cuyo numerador es mayor que el
 * denominador
 * 
 * Dos fracciones son equivalentes cuando el producto de extremos es igual al
 * producto de medios
 * 
 * Las fracciones irreducibles son aquellas que no se pueden simplificar, esto
 * sucede cuando el numerador y el denominador son primos entre si
 * 
 * Reducir varias fracciones a comun denominador consiste en convertirlas en
 * otras equivalentes que tengan el mismo denominador
 * 
 * Comparar fracciones
 * 
 * Suma fracciones: En primer lugar se reducen los denominadores a comun
 * denominador, y se suman o se restan los numeradores de las fracciones
 * equivalentes obtenidas
 * 
 * Multiplicacion: La multiplicacion de dos fracciones es otra fraccion que
 * tiene: Por numerador el producto de los numeradores. Por denominador el
 * producto de los denominadores.
 * 
 * La division de dos fracciones es otra fraccion que tiene: Por numerador el
 * producto de los extremos. Por denominador el producto de los medios. Invertir
 * fraccion
 * 
 * @author jbernal
 * 
 */
public class Fraccion {
	private int numerador;

	private int denominador;

	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public Fraccion() {
		this(1, 1);
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	public double decimal() {
		return (double) numerador / denominador;
	}

	public boolean isImpropia() {
		return ( (this.getNumerador()/this.getDenominador() ) > 1 );
	}

	public boolean isEquivalente(Fraccion fraccion1) {
		// TODO Auto-generated method stub
		return ((this.getNumerador() * fraccion1.getDenominador()) == (this
				.getDenominador() * fraccion1.getNumerador()));

	}

	public static Fraccion multiplicarFracciones(Fraccion fraccion1,
			Fraccion fraccion2) {
		int x;
		int y;
		
		x = fraccion1.numerador * fraccion2.numerador;
		y = fraccion1.denominador * fraccion2.denominador;
		Fraccion frac = new Fraccion (x,y);
		
				return frac;
	}

}
