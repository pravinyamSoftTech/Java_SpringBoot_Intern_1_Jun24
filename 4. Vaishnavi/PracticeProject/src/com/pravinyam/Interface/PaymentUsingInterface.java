package com.pravinyam.Interface;
import com.pravinyam.Interface.PaymentMode.*;
import com.pravinyam.Interface.OnlinePaymentUsingInterface.*;

public class PaymentUsingInterface implements PaymentMode,OnlinePayment{

	@Override
	public void googlepay() {
		System.out.println("Phone Pay");
		
	}

	@Override
	public void phonepay() {
		 System.out.println("Phone Pay");
	}

	@Override
	public void paytem() {
		 System.out.println("Paytem");
	       
	}

	@Override
	public void cash() {
		 System.out.println("cash");
	       
	}
	
	@Override
	public void cc() {
		 System.out.println("cc");
	       
		
	}

	@Override
	public void inpg() {
		 System.out.println("inpg");
	       
		
	}

	
	public static void main(String args[])
	{
		PaymentUsingInterface pay=new PaymentUsingInterface();
		pay.cc();
		pay.inpg();
		pay.paytem();
	
	}
}
