package multiple.inheritance;

public interface Sizeable {

	void setSize(int size);
	int getSize();

	default void doubleSize() {
		setSize(2 * getSize());
	}

}
