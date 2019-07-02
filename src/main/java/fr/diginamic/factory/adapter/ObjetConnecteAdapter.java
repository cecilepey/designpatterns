package fr.diginamic.factory.adapter;

import fr.diginamic.factory.Chargeable;
import fr.diginamic.factory.model.ObjetConnecte;

public class ObjetConnecteAdapter implements Chargeable {

	private ObjetConnecte objetConnecte;

	/**
	 * Constructeur
	 * 
	 * @param objetConnecte
	 */
	public ObjetConnecteAdapter(ObjetConnecte objetConnecte) {
		super();
		this.objetConnecte = objetConnecte;
	}

	@Override
	public void recharger(int volts) {

		if (volts > objetConnecte.getLimiteVolts()) {
			objetConnecte.recharger(objetConnecte.getLimiteVolts());
		} else {
			objetConnecte.recharger(volts);
		}
	}

}
