package lesson150922.interfaces;

public class Table extends Furniture {

	@Override
	public void crush() {
		System.out.println("Crush table.");;


	}

	public static void main(String[] args) {
		Furniture roundTable = new Furniture();
		roundTable.crush();
	}

}
