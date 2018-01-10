package ex3;

/**Représente une zone de type savane africaine
 * @author Zaccharie
 *
 */
public class SavaneAfricaine extends Zone {
	
	private static double COEFF_NOURRITURE = 10 ;
	
	@Override
	public double calculerKgsNourritureParJour(){
		return this.listAnimaux.size() * COEFF_NOURRITURE;
	}
	
	@Override
	public boolean acceptInZone(Animal animal){
		return (animal.getType().equals(TypeAnimal.MAMMIFERE) && animal.getComportement().equals(Comportement.HERBIVORE) );
	}
}
