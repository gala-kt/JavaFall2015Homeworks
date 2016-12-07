package lesson150922.inheriance.vs.composition;

public class E extends A implements Changeable {
	public E(int initialState) {
		super(initialState);
		}

	@Override
	public void change() {
		System.out.println("E");
//		super.change();
		state = (int) Math.pow(state, 2);
		System.out.println(state);

	}
}
