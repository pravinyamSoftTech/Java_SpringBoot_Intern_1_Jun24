package constructor;

public class student {
	String name;
	int age;
	
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.age);
	}
	student(String n , int a)
	{
		this.name = n;
		this.age = a;
	}
	student(student s1)
	{
		this.name=s1.name;
		this.age=s1.age;
	}

}
