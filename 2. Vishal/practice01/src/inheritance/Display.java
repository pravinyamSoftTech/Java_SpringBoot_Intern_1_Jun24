package inheritance;

public class Display {

	public static void main(String[] args) {
		method m = new method();
	
		System.out.println("The Addition Is : " +m.Add(12, 12));
		System.out.println("The Doouble Is : "+m.Add(12.12, 12.12));
		System.out.println("The Float Is : "+m.Add(12.1f, 12.2f));
	

	}

}
