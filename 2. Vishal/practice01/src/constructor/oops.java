package constructor;

public class oops {

	public static void main(String[] args) {
		student s = new student("vishal",1);
		s.display();
		
		student s1 = new student(s);
		s1.display();

	}

}
