package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.List;

public class Service implements IElement {

	private String nom;
	private List<IElement> listeElement;

	/**
	 * Constructeur
	 * 
	 * @param nom
	 */
	public Service(String nom) {
		super();
		this.nom = nom;
		listeElement = new ArrayList<>();
	}

	public void addElement(IElement element) {

		listeElement.add(element);

	}

	@Override
	public double calculerSalaire() {

		double salaire = 0;

		for (IElement liste : listeElement) {
			salaire += liste.calculerSalaire();
		}

		return salaire;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

}
