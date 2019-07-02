package fr.diginamic.factory.test;

import fr.diginamic.factory.ObjetConnecteEnum;

public class Test {

	public static void main(String[] args) {

		TestFactory.getObjet(ObjetConnecteEnum.ENCEINTE_CONNECTEE).recharger(5);
		TestFactory.getObjet(ObjetConnecteEnum.TABLETTE).recharger(15);
		TestFactory.getObjet(ObjetConnecteEnum.TELEPHONE).recharger(10);
	}

}
