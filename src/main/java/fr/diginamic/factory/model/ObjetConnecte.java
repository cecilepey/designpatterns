package fr.diginamic.factory.model;

/**
 * Classe qui représente un objet connecté
 * 
 * @author Cécile Peyras
 *
 */
public abstract class ObjetConnecte {

	private int limiteVolts;

	/**
	 * Constructeur
	 * 
	 * @param limiteVolts
	 */
	public ObjetConnecte(int limiteVolts) {
		super();
		this.limiteVolts = limiteVolts;
	}

	/**
	 * Méthode qui retourne les informations concernant le chargement de l'objet
	 * 
	 * @param volts
	 */
	public abstract void recharger(int volts);

	/**
	 * Getter
	 * 
	 * @return the limiteVolts
	 */
	public int getLimiteVolts() {
		return limiteVolts;
	}

	/**
	 * Setter
	 * 
	 * @param limiteVolts
	 *            the limiteVolts to set
	 */
	public void setLimiteVolts(int limiteVolts) {
		this.limiteVolts = limiteVolts;
	}

}
