package accessmodi;

public class PrivateExample {
	
	private int id;
	private String name;
	
	public void setId(int i)
	{
		id=i;
	}
	
//	public void setId(int i)
//	{
//		this.id=i;
//	}
//	
	public int getId()
	{
		return id;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	
//	public void setName(String n)
//	{
//		this.name = n;
//	}
	
	public String getName()
	{
		return name;
	}
	
}
