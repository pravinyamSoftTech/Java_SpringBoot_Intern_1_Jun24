package oops;

public class encapsulation {
	String name="shivani";
	int id=101;
	void displaydetails() {
		System.out.println("name="+name);
		System.out.println("id="+id);
	}
	
	public static void main(String[] args) {
		
		encapsulation e = new encapsulation();
		e.displaydetails();
	}
}


