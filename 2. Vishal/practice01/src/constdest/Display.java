package constdest;

public class Display {

	public static void main(String[] args) {
		Student s = new Student();
		Student s1 = new Student(5,"Vishal");
		Student s2 = new Student(s1);
		s.show();
		s1.show();
		s2.show();
		
	}

}
