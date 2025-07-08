package dsa.mca.demo;

public class Main extends Person {

	
	@Override   
	void f1() {
		super.f1();
		System.out.println("this is child method");
	}

	public static void main(String[] args)
	{
		Main p=new Main();
		p.f1();

	}

}
