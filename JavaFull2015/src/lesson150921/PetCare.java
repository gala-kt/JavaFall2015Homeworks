package lesson150921;

public class PetCare {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		Parrot parrot = new Parrot();
		Turtle turtle = new Turtle();
		Raven raven = new Raven();

//		cat.care();
//		turtle.care();
//		dog.care();
//		parrot.care();
//		System.out.println("\n");
//		raven.care();

		care(cat, dog, raven, parrot, turtle);

	}

	public static void care(Pet... pets) {
		for (Pet pet : pets) {
			pet.care();
		}

	}


}
