package lesson150922;

public class Specialization {

	static class Pet {
		public void feed() {
			System.out.println("Feeding pet.");
		}
	}


	static class Cat extends Pet {
		@Override
		public void feed() {
			super.feed();
			murr();
		}

		public void combBehindEar() {
			murr();
		}

		public void murr() {
			System.out.println("Murrr!");
		}
	}

}
