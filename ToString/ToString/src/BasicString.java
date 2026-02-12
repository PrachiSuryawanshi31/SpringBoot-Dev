/*toString -->
 * This program demonstrates how a HashSet stores objects and how toString() is used for meaningful output.
 * When the Employee objects are printed, System.out.println() internally calls the overridden toString() method.
 * Overriding toString() helps display object data clearly instead of the default class name and hash code.
 */

import java.util.HashSet;
import java.util.Set;

public class BasicString {
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee(101,"Sakshi");
		Employee employee2 = new Employee(102, "Prathamesh");
		
		
		Set<Employee> set = new HashSet<>();
		
		set.add(employee1);		//added in Set
		set.add(employee2);
		
		System.out.println(set); //[Employee :id=101, name=Sakshi, Employee :id=102, name=Prathamesh]
		
		System.out.println(employee1);
		
		System.out.println(employee1.toString());//Employee :id=101, name=Sakshi, 
		System.out.println(employee2.toString());//Employee :id=102, name=Prathamesh
		
		//Employee :id=101, name=Sakshi-- it print when we override the method in child class.

	}

}

class Employee
{
	private int id;
	private String name;

	//constructor
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	// Override toString() to provide meaningful string in human readable form
	@Override
	public String toString() {
		return "Employee :id=" + id + ","
				+ " name=" + name + "";
	}
	
}
