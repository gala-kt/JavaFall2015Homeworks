package lesson150922.inheriance.vs.composition;

public class D extends A implements Changeable {

	public D(int initialState) {
		super(initialState);

	}
	@Override
	public void change() {
		System.out.println("D");
		state /= 2;
		System.out.println(state);
	}

}
