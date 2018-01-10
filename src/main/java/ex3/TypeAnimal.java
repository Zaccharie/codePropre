/**
 * 
 */
package ex3;

/**
 * @author Zaccharie
 *
 */
public enum TypeAnimal {
	
	POISSON("Poisson"), MAMMIFERE("Mammifere"), REPTILE("Reptile");
	
	protected String value;
	
	private TypeAnimal(String value) {
		this.value = value;
	}
}
