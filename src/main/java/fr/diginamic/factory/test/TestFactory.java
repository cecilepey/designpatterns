package fr.diginamic.factory.test;

import fr.diginamic.factory.ObjetConnecteEnum;
import fr.diginamic.factory.model.EnceinteConnectee;
import fr.diginamic.factory.model.ObjetConnecte;
import fr.diginamic.factory.model.Tablette;
import fr.diginamic.factory.model.TelephonePortable;

/**
 * classe qui retourne une instance d'une classe fille d'ObjetConnecte
 * 
 * @author Cécile Peyras
 *
 */
public class TestFactory {

	/**
	 * méthode qui retourne une instance d'une classe fille d'ObjetConnecte
	 * 
	 * @param type
	 * @return
	 */
	public static ObjetConnecte getObjet(ObjetConnecteEnum type) {

		if (type.equals(ObjetConnecteEnum.TELEPHONE)) {
			return new TelephonePortable(5);
		} else if (type.equals(ObjetConnecteEnum.TABLETTE)) {
			return new Tablette(10);
		} else if (type.equals(ObjetConnecteEnum.ENCEINTE_CONNECTEE)) {
			return new EnceinteConnectee(15);
		}

		return null;

	}

}
