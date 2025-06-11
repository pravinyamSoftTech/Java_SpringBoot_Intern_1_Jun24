package ExceptionHandlingJava;

public class ExceptionThrow {
	public static void divide(int a, int b) {
        if (b == a) {
            throw new ArithmeticException("Cannot divide by zero!");
        } else {
            System.out.println("Result: " + (a / b));
        }
}

class Mac 
{
    public static void main(String args[]) 
    {
    	try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
    }
}
