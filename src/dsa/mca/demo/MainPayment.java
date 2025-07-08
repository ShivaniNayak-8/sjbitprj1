package dsa.mca.demo;

public class MainPayment extends Payment
{

	@Override
	void pay() {
		// TODO Auto-generated method stub
		System.out.println("Cash payment");
	}
	public static void main(String[] args) {
		MainPayment p=new MainPayment();
		p.pay();
		p.printbill();
	}

}
