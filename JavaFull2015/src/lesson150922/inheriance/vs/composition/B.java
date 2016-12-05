package lesson150922.inheriance.vs.composition;

public class B extends A {

	@Override
	public void change() {
		super.change();
		state *= 2;
	}

}
