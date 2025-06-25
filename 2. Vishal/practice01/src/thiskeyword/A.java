package thiskeyword;

//public class A {
//	
//	void Show() {
//		System.out.println(this);
//	}
//
//	public static void main(String[] args) {
//		A a = new A();
//		System.out.println(a);
//		a.Show();
//
//	}
//
//}



//public class A{
//	int a;
//	
//	A(int a){
//		this.a=a;
//	}
//	void Show() {
//		System.out.println(a);
//	}
//	public static void main(String[] args) {
//		A a = new A(25);
//		a.Show();
//		
//	}
//}





public class A{
	A(){
		System.out.println("Learn Coding");
	}
	A(int a){
		this();
		System.out.println(a);
	}
	public static void main(String[] args) {
		A a = new A(24);
		
	}
}