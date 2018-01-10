package ex3;

/**Représente une zone de type zone carnivore
 * @author Zaccharie
 *
 */
public class ZoneCarnivore extends Zone {
	
	private static double COEFF_NOURRITURE = 10.0 ;
	
	@Override
	public double calculerKgsNourritureParJour(){
		return this.listAnimaux.size() * COEFF_NOURRITURE;
	}
	
	@Override
	public boolean acceptInZone(Animal animal){
		return (animal.getType().equals(TypeAnimal.MAMMIFERE) && animal.getComportement().equals(Comportement.CARNIVORE) );
	}
}
