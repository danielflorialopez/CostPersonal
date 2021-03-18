package com.alumne.costpersonal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CostPersonalTest {
	/**
	 * Test amb un treballador de cada tipus
	 */
	@Test
	void CalculaCostDelPersonalAmb3() {

		float resultat;
		float resultatCorrecte = 6400;

		Treballador treballadors[] = new Treballador[3];

		treballadors[0] = new Treballador("Alex", Treballador.DIRECTOR, 3000, 0);
		treballadors[1] = new Treballador("Bilal", Treballador.SUBDIRECTOR, 2000, 0);
		treballadors[2] = new Treballador("Carles", Treballador.BASE, 1000, 20);

		resultat = CostPersonal.CalculaCostDelPersonal(treballadors);

		assertEquals(resultat, resultatCorrecte, "S'esperava que retornés 6400");

	}

	/**
	 * Test amb un sol treballador
	 */
	@Test
	void CalculaCostDelPersonalAmb1() {

		float resultat;
		float resultatCorrecte = 3000;

		Treballador treballadors[] = new Treballador[1];

		treballadors[0] = new Treballador("Alex", Treballador.DIRECTOR, 3000, 0);

		resultat = CostPersonal.CalculaCostDelPersonal(treballadors);

		assertEquals(resultat, resultatCorrecte, "S'esperava que retornés 3000");
	}

	/**
	 * Test amb zero treballadors
	 */
	@Test
	void CalculaCostDelPersonalAmb0() {

		float resultat;
		float resultatCorrecte = 0;

		Treballador treballadors[] = null;

		resultat = CostPersonal.CalculaCostDelPersonal(treballadors);

		assertEquals(resultat, resultatCorrecte, "El resultat hauria de ser 0");

	}

}
