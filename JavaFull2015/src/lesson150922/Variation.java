package lesson150922;

public class Variation {
	static class HuntDog {
		static void trackFox() {
		}
	}

	static class HuntDuckDog extends HuntDog {
		static void trackDuck() {
			//smth doing

			trackFox();
		}
	}


	}
