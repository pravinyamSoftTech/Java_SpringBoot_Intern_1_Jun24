package constdest;

public class Student {

	int id;
	String name;
	
	Student(){
		id = 505;       //Default Constructor
		name = "Default";
	}
	Student(int i,String s){
		id=i;                       // Parameterized Constructor
		name=s;
	}
	Student(Student s){
		id = s.id;                   //Copy Constructor
		name = s.name;
	}
	void show() {
		System.out.println(id+" "+name);
	}

}
