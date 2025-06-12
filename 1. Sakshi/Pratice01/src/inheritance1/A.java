package inheritance1;

public class A {

	public void m1()
	{
		System.out.println("Parent Class");
	}
	
	public static void main(String[] args) {
//		
//		B b = new B();
//		b.m1();
//		
//		A a = new A();
//		a.m1();
		
//		B ab = new A();
//		ab.m1();
		
		A ba = new B();
		ba.m1(); 
	}
}

class B extends A{
	
	public void m1()
	{
		System.out.println("Child Class");
	}
}