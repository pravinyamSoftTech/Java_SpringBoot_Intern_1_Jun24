package polymorphism;

public class MethodOverloading {
	
	public int demo(int a,int b)
	{
		return a+b;
	}
	
	public float demo(float a,float b)
	{
		return a-b;
	}
	
	public int demo(int a,int b,int c)
	{
		return a+b+c;
	}

	public static void main(String[] args) {
		
		MethodOverloading m = new MethodOverloading();
		
		System.out.println("The Addition of a and b : " + m.demo(20,10));
		System.out.println("The Substraction of a and b : ");
	    System.out.printf("%.2f\n", m.demo(2.5f, 2.1f));
		System.out.println("The Addition of a and b and c: " + m.demo(20,10,10));
	}
}
