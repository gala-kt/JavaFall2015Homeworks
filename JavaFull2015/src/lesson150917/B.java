package lesson150917;

public class B {

	static {
		System.out.println("static");
	}

	{
		System.out.println("instance");
	}

	public B() {

		System.out.println("constructor");
	}

}
