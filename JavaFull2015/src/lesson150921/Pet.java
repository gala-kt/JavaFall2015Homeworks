package lesson150921;

public class Pet {

	public void feed() {
		System.out.println("Pet is no hungry now.");
	}

	public void walk() {
		System.out.println("You want to walk with your pet.");

	}

	public void play() {
		System.out.println("Played with pet.");

	}

	void care() {

		play();
		feed();
		walk();

		special();


//		if (this instanceof MammalPetWithFur) {
//			((MammalPetWithFur) this).comb();
//		}
//
//		if (this instanceof Chirikable) {
//			Chirikable chirikPet = (Chirikable) this;
//			chirikPet.chirik();
//		}
	}

	public void special() {

	}


}
