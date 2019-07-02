package fr.diginamic.factory.test;

import fr.diginamic.factory.ObjetConnecteEnum;
import fr.diginamic.factory.adapter.ObjetConnecteAdapter;
import fr.diginamic.factory.model.Chargeur;

public class TestChargeur {

	public static void main(String[] args) {

		Chargeur chargeur = new Chargeur();

		chargeur.brancher(new ObjetConnecteAdapter(TestFactory.getObjet(ObjetConnecteEnum.ENCEINTE_CONNECTEE)));

	}

}
