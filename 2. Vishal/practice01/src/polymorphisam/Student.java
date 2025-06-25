package polymorphisam;

public class Student {
	String name;
	int age;
	public void display(String n)
	{
		System.out.println(name);
	}
	public void display(int a)
	{
		System.out.println(age);
	}
	public void display(String n , int a)
	{
		System.out.println(name+" "+age);
	}

}
