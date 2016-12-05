package lesson150922;

public class LiskovSubstitutionPrincipal {
	public static void main(String[] args) {
		Object o = new String("Hello!");

		System.out.println();
		System.out.println("---------");
		System.out.println(o.toString());
		System.out.println(o.hashCode());
		System.out.println(o.getClass());
		System.out.println(o.equals(o));

		o = new Object();

		System.out.println();
		System.out.println("---------");
		System.out.println(o.toString());
		System.out.println(o.hashCode());
		System.out.println(o.getClass());
		System.out.println(o.equals(o));

		o = new String();

		System.out.println();
		System.out.println("---------");
		System.out.println(o.toString());
		System.out.println(o.hashCode());
		System.out.println(o.getClass());
		System.out.println(o.equals(o));

		o = new String("My God!");

		System.out.println();
		System.out.println("---------");
		System.out.println(o.toString());
		System.out.println(o.hashCode());
		System.out.println(o.getClass());
		System.out.println(o.equals(o));
	}

}
