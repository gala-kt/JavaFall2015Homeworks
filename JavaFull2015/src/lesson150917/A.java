package lesson150917;

public class A {

	private static final int NONE = -1;

	private static int globalCount;

	private int x;

	public A(int x) {
		this.x =x;
		globalCount++;
	}

	public A() {
		this(NONE);
	}

	static public void staticMethod() {
		System.out.println("Static.");
//		A.x = 10;
//		System.out.println(x);
	}

	public static void staticMethod(A a) {
//		a.x = 10;
		System.out.println(a.x);

	}

	public static void printCount() {
		System.out.println("globalCount = " + globalCount);

	}

}
