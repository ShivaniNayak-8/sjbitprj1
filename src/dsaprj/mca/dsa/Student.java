package dsaprj.mca.dsa;

public class Student {

	public static void main(String[] args) {
		Product p1=new Product(100,"DEsktop",12000);
		Product p2=new Product(100,"DEsktop",12000);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

	}
}
