package multiple.inheritance;

public interface Moveable {

	int getX();
	int setX(int x);

	default void moveBy(int shift) {
		setX(getX() + shift);
	}


}
