package ex3;

/**Représente une zone de type FermeReptile
 * @author Zaccharie
 *
 */
public class FermeReptile extends Zone {

	private static double COEFF_NOURRITURE = 0.1 ;
	
	@Override
	public double calculerKgsNourritureParJour(){
		return this.listAnimaux.size() * COEFF_NOURRITURE;
	}
	
	@Override
	public boolean acceptInZone(Animal animal){
		return animal.getType().equals(TypeAnimal.REPTILE);
	}
}
