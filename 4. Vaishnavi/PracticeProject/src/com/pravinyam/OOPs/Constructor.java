package com.pravinyam.OOPs;

 public class Constructor
 {
	 String name;
	 int price;
	 
	 public Constructor(String name,int price)
	 {
		 this.name=name;
		 this.price=price;
     }
	 
	  public void display()
	  {
		  System.out.println("Name of car"+name);
		  System.out.println("Price of car"+price);
	  }
	  
	  public static void main(String args[])
	  {
		  Constructor car=new Constructor("Kiyya",24000000);
		  car.display();
		  
	}
 }