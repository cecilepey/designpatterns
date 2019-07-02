package fr.diginamic.factory;

/**
 * Enumération des objets connectés
 * 
 * @author Cécile Peyras
 *
 */
public enum ObjetConnecteEnum {

	TELEPHONE("Téléphone portable"), TABLETTE("Tablette"), ENCEINTE_CONNECTEE("Enceinte connectée");

	/** type : String : type d'absence possible */
	private String ObjetConnecte;

	/**
	 * Constructeur
	 * 
	 * @param objetConnecte
	 */
	private ObjetConnecteEnum(String objetConnecte) {
		ObjetConnecte = objetConnecte;
	}

	/**
	 * Getter
	 * 
	 * @return the objetConnecte
	 */
	public String getObjetConnecte() {
		return ObjetConnecte;
	}

	/**
	 * Setter
	 * 
	 * @param objetConnecte
	 *            the objetConnecte to set
	 */
	public void setObjetConnecte(String objetConnecte) {
		ObjetConnecte = objetConnecte;
	}

}
