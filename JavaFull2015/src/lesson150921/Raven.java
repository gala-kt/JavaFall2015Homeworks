package lesson150921;

public class Raven extends Pet implements Chirikable {

	@Override
	public void chirik() {
		System.out.println("Karrrrrr!");

		}

	@Override
	public void special() {
		chirik();
	}
}
