package lesson150922.interfaces;

public class GarbageCollector {

	public static void main(String[] args) {

		Car car = new Car();
		Table table = new Table();

//		Vehicle x = new Vehicle();

		Crushable[] things = {car, table};

		collect(things);
	}

	private static void collect(Crushable[] things) {
		for (Crushable crushable : things) {
			crushable.crush();

		}

	}

}
