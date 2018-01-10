package ex3;

/**Représente une zone de type aquarium
 * @author Zaccharie
 *
 */
public class Aquarium extends Zone{
	
	private static double COEFF_NOURRITURE = 0.2 ;
	
	@Override
	public double calculerKgsNourritureParJour(){
		return this.listAnimaux.size() * COEFF_NOURRITURE;
	}
	
	@Override
	public boolean acceptInZone(Animal animal){
		return animal.getType().equals(TypeAnimal.POISSON);
	}
}
