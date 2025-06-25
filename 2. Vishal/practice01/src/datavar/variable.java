package datavar;

public class variable {
	int age = 30;     // global variable
	
	static String Company ="Google"; // static variable
	
	public void m1() {
		String name = "Vishal";     // local variable
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Company :"+Company);
	}

	public static void main(String[] args) {
		variable v = new variable();
		
		v.m1();

	}

}
