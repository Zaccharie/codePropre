package ex2;

/**Represente l'objet LivretA
 * 
 * @author ETY19
 *
 */
public class LivretA extends CompteBancaire {
	
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	protected double tauxRemuneration;
	
	/**
	 * 
	 * @param type parametre type
	 * @param solde parametre solde
	 * @param tauxRemuneration parametre tauxRemuneration
	 */
	public LivretA(String type, double solde, double tauxRemuneration) {
		super(type, solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	@Override
	public void debiterMontant(double montant) {
		
		if (this.solde - montant > 0) {
			this.solde = solde - montant;
		}
	}
	
	/**
	 * Applique le taux de remuneration annuelle
	 * 
	 * @param montant
	 */
	public void appliquerTauxRemenureationAnnuelle() {
		
		this.solde = solde + solde * tauxRemuneration / 100;

	}
	
	/**
	 * Getter for tauxRemuneration
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration
	 *            the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
