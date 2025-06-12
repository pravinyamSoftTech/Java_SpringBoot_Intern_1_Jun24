package constructors;

public class Employee {

	int id ;
	String name;

	Employee()               //default constructor 
	{
		id=1;
		name="default";
	}
	
	Employee(int i,String s)               //parameterized constructor 
	{
		id=i;
		name=s;
	}
	
	Employee(Employee e)               //copy constructor 
	{
		id=e.id;
		name=e.name;
	}
	
	void show()
	{
		System.out.println(id + " " + name);
	}
	
}
