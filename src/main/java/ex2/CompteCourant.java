package ex2;

/**Représente l'objet CompteCourant
 * 
 * @author ETY19
 *
 */
public class CompteCourant extends CompteBancaire {
	
	/**
	 * 
	 * @param type parametre type
	 * @param solde parametre solde
	 * @param decouvert parametre decouvert
	 */
	public CompteCourant(String type, double solde, double decouvert) {
		super(type, solde, decouvert);
	}
	
	@Override
	public void debiterMontant(double montant) {
		
		if (this.solde - montant > decouvert) {
			this.solde = solde - montant;
		}
	}

}
