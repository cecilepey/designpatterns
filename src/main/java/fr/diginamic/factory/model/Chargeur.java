package fr.diginamic.factory.model;

import fr.diginamic.factory.Chargeable;

public class Chargeur {

	private int volts = 220;

	/**
	 * Constructeur
	 * 
	 * @param volts
	 */
	public Chargeur() {
		super();
	}

	public void brancher(Chargeable chargeable) {
		chargeable.recharger(volts);
	}

	/**
	 * Getter
	 * 
	 * @return the volts
	 */
	public int getVolts() {
		return volts;
	}

	/**
	 * Setter
	 * 
	 * @param volts
	 *            the volts to set
	 */
	public void setVolts(int volts) {
		this.volts = volts;
	}

}
