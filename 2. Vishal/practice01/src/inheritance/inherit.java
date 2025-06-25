package inheritance;

class inherit extends singalinhe{
	void show(){
		roll_no =101;
		name = "vishal";
		marks = 69;
		System.out.println("Roll No Is : "+roll_no);
		System.out.println("Name  Is : "+name);
		System.out.println("Marks  Is : "+marks);
	}
	public static void main(String []args) {
		inherit i = new inherit();
		i.dis();
		i.show();
	}
}
