import java.util.LinkedList ;

public class linkedListDemo {

	public static void main(String[] args) {
		//Basic LinkedList Demo
		
		LinkedList<String> names = new LinkedList<>();
		
		names.add("Prachi");
		names.add("Aditi");
		names.add("Komal");
		names.add("Shraddha");
		
		System.out.println("Names : " + names);
		System.out.println("First Element :" + names.getFirst());

		names.remove("Prachi");
		System.out.println("After Removing Aditi: " + names);
		
		
		
		
	}
}
