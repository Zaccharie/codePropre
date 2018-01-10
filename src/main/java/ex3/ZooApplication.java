package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		
		zoo.addAnimal( new Animal("Gazelle", "MAMMIFERE", Comportement.HERBIVORE));
		zoo.addAnimal(new Animal("Lion", "MAMMIFERE", Comportement.CARNIVORE));
		
		zoo.afficherListeAnimaux();
		
	}

}
