package fr.diginamic.factory.model;

/**
 * Classe qui représente une enceinte connectée
 * 
 * @author Cécile Peyras
 *
 */
public class EnceinteConnectee extends ObjetConnecte {

	/**
	 * Constructeur
	 * 
	 * @param limiteVolts
	 */
	public EnceinteConnectee(int limiteVolts) {
		super(limiteVolts);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void recharger(int volts) {
		if (volts > getLimiteVolts()) {

			System.out.println("L'enceinte connectée est grillée");

		} else if (volts == getLimiteVolts()) {

			System.out.println("L'enceinte connectée est en charge");

		} else {

			System.out.println("tension insuffisante pour la charge de l'enceinte");
		}

	}

}
