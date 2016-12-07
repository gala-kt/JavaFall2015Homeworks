package lesson150922.inheriance.vs.composition;

public class C implements Changeable {

	Changeable changer;

	@Override
	public void change() {
		System.out.println("C");
		changer.change();
	}

	public void setChanger(Changeable changer) {
		this.changer = changer;
	}



}
