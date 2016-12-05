package lesson150922.inheriance.vs.composition;

public class UseAB {
	public static void main(String[] args) {
		 B b = new B();
		 b.change();
		 System.out.println(b.state);

		 D d = new D();
		 d.change();
		 System.out.println(d.state);
	}


}
