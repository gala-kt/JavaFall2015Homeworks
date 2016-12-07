package lesson150922.inheriance.vs.composition;

public class UseAB {
	public static void main(String[] args) {
		 B b = new B();
		 b.change();
		 System.out.println(b.state);

		 D d = new D(5);
		 d.change();
		 System.out.println(d.state);

		 E e = new E(2);
		 e.change();
		 System.out.println(e.state);

		 C ch = new C();
		 ch.setChanger(new D(10));
		 ch.change();
         ch.setChanger(new E(1));
		 ch.change();




	}



}
