package lab13;

class Employee1
{
	int id;
	String name;
	
	public Employee1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class Exercise4 
{

	interface Show
	{
		Employee1 get(int id,String s);
	}
	
	public static void main(String args[])
	{
		Show s=Employee1::new;
		Employee1 e=s.get(1,"Hrishikesh");
		System.out.println(e);
		
	}
}
