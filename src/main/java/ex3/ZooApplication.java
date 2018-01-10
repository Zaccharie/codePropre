package ex3;

/**Point d'entrée de l'application
 * @author Zaccharie
 *
 */
public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		
		zoo.addAnimal(new Animal("Gazelle", TypeAnimal.MAMMIFERE, Comportement.HERBIVORE));
		zoo.addAnimal(new Animal("Lion", TypeAnimal.MAMMIFERE, Comportement.CARNIVORE));
		zoo.addAnimal(new Animal("Requin", TypeAnimal.POISSON, Comportement.CARNIVORE));
		zoo.addAnimal(new Animal("Dragon", TypeAnimal.REPTILE, Comportement.CARNIVORE));
		
		zoo.afficherListeAnimaux();
		
	}

}
