package lesson150921;

public abstract class MammalPetWithFur extends Pet {

	abstract public void comb();

//	@Override
//	void care() {
//		super.care();
//		comb();
//	}

	@Override
	public void special() {
		comb();
	}

}
