package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class test_1_2 {
	/**
	 * Ejercicio 1.2: Crear un Test donde se eval�e, 
	 * dado tres variables String, dos sean iguales y la tercera sea distinta.
	 */
	@Test
	void test_1_2() {
		
		String valor1="igual";
		String valor2="igual";
		String valor3="distinto";
		
		if (valor1.equals(valor2) && !valor1.equals(valor3)) {
			assertTrue(true);
		}else {
			assertTrue(false);
		}
		
	}
}
