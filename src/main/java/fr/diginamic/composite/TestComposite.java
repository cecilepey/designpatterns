package fr.diginamic.composite;

public class TestComposite {

	public static void main(String[] args) {

		IElement cecile = new Employe(10000, "raspey", "cecile");
		IElement bilel = new Employe(8000, "bechkar", "bilel");
		Service DSIN = new Service("DSIN");

		DSIN.addElement(bilel);
		DSIN.addElement(cecile);

		Service bigData = new Service("Big Data");
		IElement jb = new Employe(7500, "jb", "ranmey");
		IElement jane = new Employe(3500, "jane", "doe");

		bigData.addElement(jb);
		bigData.addElement(jane);

		DSIN.addElement(bigData);

		Service java = new Service("Java Dev");
		IElement kevin = new Employe(7500, "kein", "guinau");
		IElement paul = new Employe(3500, "paul", "martin");

		java.addElement(kevin);
		java.addElement(paul);

		DSIN.addElement(java);

		System.out.println(DSIN.calculerSalaire());
	}

}
