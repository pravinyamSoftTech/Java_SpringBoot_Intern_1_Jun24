package datavari;

public class variable {

	int age = 30;                       //global variable
	
	static String company = "Google";   //static variable
	
//	public void m1()
//	{
//		String name = "Sakshi";         // local variable
//		
//		System.out.println("Name: " + name);
//		System.out.println("Age : " + age);
//		System.out.println("Company : " + company);
//	}
	
	public static void main(String[] args) {
		
		variable v = new variable();
//		
//		v.m1();
		
		System.out.println("Age : " + v.age);
	}
}
