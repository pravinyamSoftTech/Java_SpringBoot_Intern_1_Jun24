package com.pravinyam.util;

import com.pravinyam.calculation.*;
//import com.pravinyam.calculation.Substraction;

public class Main {

	public static void main(String[] args) {

		UseAddition a1 = new UseAddition();

		a1.display1();

		Substraction a2 = new Substraction();
		System.out.println("Substraction of a nd b " + a2.sub(30, 10));

	}

}
