package lesson150922.inheriance.vs.composition;

public class B extends A {

	@Override
	public void change() {
		System.out.println("B");
		super.change();
		state *= 2;
		System.out.println(state);
	}

}
