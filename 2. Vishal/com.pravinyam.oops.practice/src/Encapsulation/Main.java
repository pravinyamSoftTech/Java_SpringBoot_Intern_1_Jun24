package Encapsulation;

public class Main {

	public static void main(String[] args) {
		Atm a1 = new Atm();
		a1.setBalance(1000);
		System.out.println("Account Balance : " + a1.getBalance());
		
		a1.setPin(1223);
		System.out.println("Pin : " + a1.getPin());

	}

}
