package accessmodifier;

public class publicexample {
	public int number = 10;
	
	public void show() {
		System.out.println("Public Number : "+number);
	}
	

	public static void main(String[] args) {
		publicexample p = new publicexample();
		p.show();

	}

}
