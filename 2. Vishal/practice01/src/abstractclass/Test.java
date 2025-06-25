package abstractclass;

public class Test {

	public static void main(String[] args) {
		 
		
		Html j = new Java();
		j.Devloper();
		j.Devloper1();
		
		Java jw = new Java();
		
		//j.rank();
		//DemoChild d1 = new Demo();
//		Demo d1 = new DemoChild();
//		d1.main1();
		//d1.main2();s

	}

}


class Demo {
	
	public void main1()
	{
		System.out.println("parents");
	}
	public void main2()
	{
		System.out.println("parents main2");
	}
}

class DemoChild extends Demo {
	
	public void main1()
	{
		System.out.println("child");
	}
}