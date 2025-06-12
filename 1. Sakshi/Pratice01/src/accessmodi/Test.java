package accessmodi;

public class Test {

	public static void main(String[] args) {
		
		PublicExample pub = new PublicExample();
		pub.show();
		
		PrivateExample pri = new PrivateExample();
		
		pri.setId(1000);
		System.out.println("ID is : " + pri.getId());
		
		pri.setName("Sakshi");
		System.out.println("Name is : " +  pri.getName());
		
	}

}
