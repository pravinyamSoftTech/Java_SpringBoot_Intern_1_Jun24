package accessmodifier;

public class Test {

	public static void main(String[] args) {
		privateexample pri = new privateexample();
		
		pri.setId(101);
		System.out.println("The id is : "+pri.getId());
		pri.setName("Vishal");
		System.out.println("The Name is : "+pri.getName());
		
		

	}

}
