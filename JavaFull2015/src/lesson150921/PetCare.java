package lesson150921;

public class PetCare {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		Parrot parrot = new Parrot();
		Turtle turtle = new Turtle();

		care(cat);
		care(turtle);
		care(dog);

	}

	private static void care(Pet pet) {

		pet.play();
		pet.feed();
		pet.walk();


		if (pet instanceof MammalPetWithFur) {
			((MammalPetWithFur) pet).comb();
		}
	}



}
