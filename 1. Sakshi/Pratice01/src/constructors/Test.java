package constructors;

public class Test {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee(2,"sakshi");
		Employee e3 = new Employee(e2);
		
		e1.show();
		e2.show();
		e3.show();

	}

}
