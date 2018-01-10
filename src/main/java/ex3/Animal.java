package ex3;

/**Représente un Animal
 * @author Zaccharie 
 *
 */
public class Animal {
	
	protected String nom;
	protected TypeAnimal type;
	protected Comportement comportement;
	
	/**
	 * @param nom
	 * @param type
	 * @param comportement
	 */
	public Animal(String nom, TypeAnimal type, Comportement comportement) {
		super();
		this.nom = nom;
		this.type = type;
		this.comportement = comportement;
	}

	/**
	 * @return
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return
	 */
	public TypeAnimal getType() {
		return type;
	}

	/**
	 * @param type
	 */
	public void setType(TypeAnimal type) {
		this.type = type;
	}

	/**
	 * @return
	 */
	public Comportement getComportement() {
		return comportement;
	}

	/**
	 * @param comportement
	 */
	public void setComportement(Comportement comportement) {
		this.comportement = comportement;
	}
	
}
