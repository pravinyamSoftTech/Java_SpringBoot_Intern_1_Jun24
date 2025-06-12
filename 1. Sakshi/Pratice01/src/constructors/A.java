package constructors;

public class A {

	int a;
	
	A(int a)
	{
		this.a=a;
	}
	
	void show()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
	
		A r = new A(20);
		r.show();
		
	}

}
