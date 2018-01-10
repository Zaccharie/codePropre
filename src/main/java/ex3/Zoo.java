package ex3;

import ex3.Animal;

public class Zoo {

	private String nom;
	private Zone savaneAfricaine = new Zone();
	private Zone zoneCarnivore = new Zone();
	private Zone fermeReptile = new Zone();
	private Zone aquarium = new Zone();
	
	public Zoo(String nom){
		this.nom = nom;
	}
	
	public void addAnimal(Animal animal){
		
		if(animal.type.equals("MAMMIFERE") && animal.comportement.equals(Comportement.HERBIVORE)) {
			savaneAfricaine.addAnimalToZone(animal);
		}
		else if (animal.type.equals("MAMMIFERE") && animal.comportement.equals(Comportement.CARNIVORE)){
			zoneCarnivore.addAnimalToZone(animal);
		}
		else if (animal.type.equals("REPTILE")){
			fermeReptile.addAnimalToZone(animal);
		}
		else if (animal.type.equals("POISSON")){
			aquarium.addAnimalToZone(animal);
		}
		
	}
	
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
