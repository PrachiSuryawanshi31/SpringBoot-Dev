/*toString() is a method of the Object class, 
 * and by default it prints the class name followed by @ and the hash code,
 *  which is not readable.We override toString() to display 
 *  object data in a meaningful and human-readable form.*/

public class Basic {
	public static void main(String[] args)

{ 
	Student s1 = new Student(1,"Siya");
	Student s2 = new Student(2,"Riya");
	
	//Student@24d46ca6-it print when we not override the toString method in child class
	
	System.out.println(s1); //Student@24d46ca6-
	System.out.println(s1.toString()); //Student@24d46ca6
	System.out.println(s2.toString());
	
	//and when we override this method then it gives output--->Student [id=1, name= Siya ]
} 
} 

class Student
{
	private int id;
	private String name;
	
	//Constructor
	public Student(int id, String name)
	{
		super();
		this.id = id;
		this.name = name; 
	}
	
	//Override the toString()method
	@Override 
	public String toString()
	{ 
		return "Student [id=" + id + ", name=" + name + "]";
	}

}