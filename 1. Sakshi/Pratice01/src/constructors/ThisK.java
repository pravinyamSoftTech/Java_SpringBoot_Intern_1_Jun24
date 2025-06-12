package constructors;

public class ThisK {
	
	void show()
	{
		System.out.println(this);
	}

	public static void main(String[] args) {
		 
		ThisK tk = new ThisK();
		
		System.out.println(tk);
		tk.show();
	}
}
