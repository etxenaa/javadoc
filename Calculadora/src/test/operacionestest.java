package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import operaciones.Operaciones;

class operacionestest {


	void testSumar() {
		Operaciones o = new Operaciones ();
		int num1 = 3, num2 = 2;
		int resultado = o.sumar(num1,num2);
		assertEquals(resultado,5);
	}

	
	void testRestar() {
		Operaciones o = new Operaciones ();
		int num1 = 3, num2 = 2;
		int resultado = o.restar(num1,num2);
		assertEquals(resultado,1);
	}

	
	void testMultiplicar() {
		Operaciones o = new Operaciones ();
		int num1 = 3, num2 = 2;
		int resultado = o.multiplicar(num1,num2);
		assertEquals(resultado,6);
	}

	
	void testDividir() {
		Operaciones o = new Operaciones ();
		int num1 = 4, num2 = 2;
		int resultado = o.dividir(num1,num2);
		assertEquals(resultado,2);
	}

	
	void testResto() {
		Operaciones o = new Operaciones ();
		int num1 = 3, num2 = 2;
		int resultado = o.resto(num1,num2);
		assertEquals(resultado,1);
	}

}
