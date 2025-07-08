package dsa.mca.demo;

public class ImplementFInter
{
	public static void main(String[] args)
	{
		DemoInterface p = (x,y)->System.out.println(x+y);
		p.add(10,30);
	}

}
