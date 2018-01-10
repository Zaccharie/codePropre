package ex3;

public enum Comportement {
	
	CARNIVORE("Carnivore"), HERBIVORE("Herbivore");
	
	protected String value;
	
	private Comportement(String value) {
		this.value = value;
	}

}
