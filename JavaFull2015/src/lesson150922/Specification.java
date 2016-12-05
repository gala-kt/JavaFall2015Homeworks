package lesson150922;

public class Specification {

	static abstract class Pet {
		abstract void wash();

		abstract void comb();
	}

	static class Dog extends Pet {
		@Override
		void wash() {
			System.out.println("Washing your dog.");

		}

		@Override
		void comb() {
			// TODO Auto-generated method stub

		}

	}

}
