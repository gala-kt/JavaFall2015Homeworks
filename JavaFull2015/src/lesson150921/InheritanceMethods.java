package lesson150921;

public class InheritanceMethods {

	static class A {

		int calc() {
			return 2 * 2;
		}
	}

	static class B extends A {

		@Override
		int calc() {
			return 0;
		}
	}

	public static void main(String[] args) {

		A a = new A();
		System.out.println(a.calc());
		String f = new String();

		B b = new B();
		System.out.println(b.calc());
	}


}
