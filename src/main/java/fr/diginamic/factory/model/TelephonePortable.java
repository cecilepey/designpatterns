package fr.diginamic.factory.model;

/**
 * Classe qui représente une téléphone portable
 * 
 * @author Cécile Peyras
 *
 */
public class TelephonePortable extends ObjetConnecte {

	/**
	 * Constructeur
	 * 
	 * @param limiteVolts
	 */
	public TelephonePortable(int limiteVolts) {
		super(limiteVolts);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void recharger(int volts) {
		if (volts > getLimiteVolts()) {

			System.out.println("Le téléphone portable est grillé");

		} else if (volts == getLimiteVolts()) {

			System.out.println("Le téléphone portable est en charge");

		} else {

			System.out.println("tension insuffisante pour la charge du téléphone");
		}

	}

}
