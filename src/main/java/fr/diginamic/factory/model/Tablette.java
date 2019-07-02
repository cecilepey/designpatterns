package fr.diginamic.factory.model;

/**
 * Classe qui représente une tablette
 * 
 * @author Cécile Peyras
 *
 */
public class Tablette extends ObjetConnecte {

	/**
	 * Constructeur
	 * 
	 * @param limiteVolts
	 */
	public Tablette(int limiteVolts) {
		super(limiteVolts);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void recharger(int volts) {
		if (volts > getLimiteVolts()) {

			System.out.println("La tablette est grillée");

		} else if (volts == getLimiteVolts()) {

			System.out.println("La tablette est en charge");

		} else {

			System.out.println("tension insuffisante pour la charge de la tablette");
		}

	}

}
