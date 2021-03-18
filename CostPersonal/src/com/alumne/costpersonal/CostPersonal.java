package com.alumne.costpersonal;

/**
 * Classe per a calcular el cost total de les nomines del personal
 * 
 * @author Dani 
 */
public class CostPersonal {
	// static enum TipusTreballador{
	// DIRECTOR, SUBDIRECTOR, BASE
	// }
	
	/**
	 * 
	 * @param treballadors
	 * @return si no hi ha cap treballador retorna 0, si n'hi ha retorna costFinal
	 */
	static float CalculaCostDelPersonal(Treballador treballadors[]) {
		float costFinal = 0;
		Treballador treballador;

		if (treballadors == null) {
			return 0;
		}

		for (int i = 0; i < treballadors.length; i++) {
			treballador = treballadors[i];
			if (treballador.getTipusTreballador() == Treballador.DIRECTOR
					|| treballador.getTipusTreballador() == Treballador.SUBDIRECTOR) {
				costFinal += treballador.getNomina();
			} else {
				costFinal += treballador.getNomina() + (treballador.getHoresExtres() * 20);
			}
		}
		return costFinal;
	}
	
	/**
	 * 
	 * @param	treballador
	 * @return	si el treballador és el director o el subdirector retorna treballador.getNomina,
	 * 			si és un treballador base li sumarà les hores extres a treballador.getNomina i ho retorna
	 */
	static float CostTreballador(Treballador treballador) {
		if (treballador.getTipusTreballador() == Treballador.DIRECTOR
				|| treballador.getTipusTreballador() == Treballador.SUBDIRECTOR) {
			return treballador.getNomina();
		} else {
			return treballador.getNomina() + (treballador.getHoresExtres() * 20);
		}
	}

	/**
	 * 
	 * @param 	treballadors
	 * @return	costFinal 		serà la suma de tots els treballadors inserits a l'array
	 */
	static float CalculaCostDelPersonal2(Treballador treballadors[]) {
		// Versio refactoritzada del mètode anterior
		float costFinal = 0;
		//Treballador treballador;
		for (int i = 0; i < treballadors.length; i++) {
			costFinal = costFinal + CostTreballador(treballadors[i]);
		}
		return costFinal;
	}
}