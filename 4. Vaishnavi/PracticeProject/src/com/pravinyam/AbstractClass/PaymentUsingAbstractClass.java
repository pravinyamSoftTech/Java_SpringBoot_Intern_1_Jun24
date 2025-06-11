package com.pravinyam.AbstractClass;
import com.pravinyam.AbstractClass.OnlinePayment.*;
import com.pravinyam.AbstractClass.PaymentMode.*;

public class PaymentUsingAbstractClass extends PaymentMode {

	@Override
	public void googlepay() {
        System.out.println("Google Pay");
        return;
    }
	
	@Override
	public void phonepay() {
		System.out.println("PhonePay");
		return;
	}

	@Override
	public void paytem() {
		System.out.println("Paytem");
		return ;
	}

	@Override
	public void cash() {
		System.out.println("cash");
		return ;
	}
	
		public static void main(String[]  args)
		{
			PaymentUsingAbstractClass pay=new PaymentUsingAbstractClass();
			pay.googlepay();
			pay.cash();
			pay.paytem();
			pay.phonepay();
		}

	}


