package com.pravinyam.inheritance;


class Child extends Parent {
	   String Add = "Pune";
	   public void display() {
		   super.display();
		   
		   System.out.println(Add);
	   }
	public String getAdd() {
		return Add;
	}
	public void setAdd(String add) {
		Add = add;
	}
	}
