package datavari;

public class PrimitiveD {
	
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean bo;
	
	public static void main(String[] args) {
		
		PrimitiveD p = new PrimitiveD();
		
		System.out.println("Byte : " + p.b);
		System.out.println("Short : " + p.s);
		System.out.println("Int : " + p.i);
		System.out.println("Long : " + p.l);
		System.out.println("Float : " + p.f);
		System.out.println("Double : " + p.d);
		System.out.println("Char : " + p.c + " ");
		System.out.println("Boolean : " + p.bo);
	}
}
